package com.jaemzware;

import org.junit.Test;

import static org.junit.Assert.assertTrue;

public class StringWordsTest {

    @Test
    public void validWordOneCombination(){
        assertTrue(StringWords.getAllCombinationsOfEnglishWords("it").size()==1);
    }

    @Test
    public void validWordMultipleCombinations(){
        assertTrue(StringWords.getAllCombinationsOfEnglishWords("cat").size()>0);
    }

    @Test
    public void invalidWordOneCombination(){
        assertTrue(StringWords.getAllCombinationsOfEnglishWords("ti").size()==1);
    }

    @Test
    public void invalidWordMultipleCombinations(){
        assertTrue(StringWords.getAllCombinationsOfEnglishWords("atc").size()>0);
    }

    @Test
    public void invalidWordNoCombinations(){
        assertTrue(StringWords.getAllCombinationsOfEnglishWords("zzzzzzz").size()==0);
    }

    @Test
    public void emptyString(){
        assertTrue(StringWords.getAllCombinationsOfEnglishWords("").size()==0);
    }

    @Test
    public void wordWithSpaces(){
        assertTrue(StringWords.getAllCombinationsOfEnglishWords("ad hoc").size()>0);
    }


}

