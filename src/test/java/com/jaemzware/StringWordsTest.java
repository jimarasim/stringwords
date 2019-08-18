package com.jaemzware;

import org.junit.Test;

import java.util.List;

import static org.junit.Assert.assertTrue;

public class StringWordsTest {

    @Test
    public void validWordOneCombination(){

        List<String> words = StringWords.getAllCombinationsOfEnglishWords("it");

        assertTrue(words.size()==1);
        assertTrue( words.get(0) == "it");
    }

    @Test
    public void validWordMultipleCombinations(){

        List<String> words = StringWords.getAllCombinationsOfEnglishWords("cat");

        assertTrue(words.size()==4);
        assertTrue(words.contains("cat"));
        assertTrue(words.contains("act"));
        assertTrue(words.contains("a"));
        assertTrue(words.contains("at"));
    }

    @Test
    public void invalidWordOneCombination(){

        List<String> words = StringWords.getAllCombinationsOfEnglishWords("ti");

        assertTrue(words.size()==1);
        assertTrue(words.get(0)=="it");
    }

    @Test
    public void invalidWordMultipleCombinations(){

        List<String> words = StringWords.getAllCombinationsOfEnglishWords("atc");

        assertTrue(words.size()==4);
        assertTrue(words.contains("cat"));
        assertTrue(words.contains("act"));
        assertTrue(words.contains("a"));
        assertTrue(words.contains("at"));
    }

    @Test
    public void invalidWordNoCombinations(){

        List<String> words = StringWords.getAllCombinationsOfEnglishWords("zzzzzzz");

        assertTrue(words.size()==0);
    }

    @Test
    public void emptyString(){

        List<String> words = StringWords.getAllCombinationsOfEnglishWords("");

        assertTrue(words.size()==0);
    }

    @Test
    public void wordWithSpaces(){

        List<String> words = StringWords.getAllCombinationsOfEnglishWords("ad hoc");

        assertTrue(words.size()==0);
        assertTrue(words.contains("ad hoc"));
        assertTrue(words.contains("cad"));
        assertTrue(words.contains("a"));
        assertTrue(words.contains("oh"));

    }


}

