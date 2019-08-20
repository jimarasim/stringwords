package com.jaemzware;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Dictionary {

    public static boolean isEnglishWord(String word) {

        String[] words = {"cat", "a", "act", "at", "ad hoc", "cad", "it", "oh", "i"};
        List<String> dictionary = Arrays.asList(words);

        if(!dictionary.contains(word)) {
            return false;
        }

        return true;

    }
}
