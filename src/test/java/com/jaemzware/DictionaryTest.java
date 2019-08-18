package com.jaemzware;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

public class DictionaryTest
{

    @Test
    public void emptyString()
    {
        assertFalse( Dictionary.isEnglishWord("") );
    }

    @Test
    public void stringInDictionary()
    {
        assertTrue( Dictionary.isEnglishWord("cat") );
    }

    @Test
    public void stringNotInDictionary()
    {
        assertFalse( Dictionary.isEnglishWord("asldkjf") );
    }

    @Test
    public void stringOfMultipleWords()
    {
        assertFalse(Dictionary.isEnglishWord("the dog ate the food"));
    }
}
