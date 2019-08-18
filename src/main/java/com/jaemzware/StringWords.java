package com.jaemzware;

import java.util.*;

import static java.util.Collections.sort;

/**
 * Hello world!
 *
 */
public class StringWords
{
    public static void main( String[] args )
    {
        List<String> combinations = getAllCombinationsOfEnglishWords(args[0]);

        for(String combination: combinations) {
            System.out.println(combination);
        }

    }

    public static List<String> getAllCombinationsOfEnglishWords(String word) {

        //get string combinations, using a hash to remove the duplicates
        List<String> combinations = new ArrayList<>(new HashSet<>(generateAllStringCombinations(word)));

        //remove non-english words
        for(String combination: combinations) {
            if(!Dictionary.isEnglishWord(combination)) {
                combinations.remove(combination);
            }
        }

        sort(combinations);

        return combinations;
    }

    private static List<String> generateAllStringCombinations(String words) {

        List<String> combinations = new ArrayList<>();

        //for each letter as current letter, get all forward and reverse combinations
        for(int currentLetter = 0; currentLetter < words.length(); currentLetter++) {
            combinations.addAll(generateForwardCombinations(currentLetter, words));
            combinations.addAll(generateReverseCombinations(currentLetter, words));
        }

        return combinations;
    }

    //for the current letter and each possible string length ...
    //walk forward through the string, successively adding letters to the current, storing a combination at each length
    private static List<String> generateForwardCombinations (int currentLetter, String words) {

        List<String> forwardCombinations = new ArrayList<>();

        for(int numLetters = 1; numLetters <= words.length(); numLetters++) {

            String combination = "";
            combination += words.charAt(currentLetter);

            if(numLetters==1) {
                forwardCombinations.add(combination);
                continue;
            }

            for (int i = 0, j = currentLetter; i < numLetters; i++, j++) {

                if(j == words.length()) {
                    j = 0;
                }

                if (currentLetter != j) {
                    combination += words.charAt(j);
                }
            }

            forwardCombinations.add(combination);
        }

        return forwardCombinations;
    }

    //for the current letter and each possible string length ...
    //walk backward through the string, successively adding letters to the current, storing a combination at each length
    private static List<String> generateReverseCombinations (int currentLetter, String words) {

        List<String> reverseCombinations = new ArrayList<>();

        for(int numLetters = 1; numLetters <= words.length(); numLetters++) {

            String combination = "";
            combination += words.charAt(currentLetter);

            if(numLetters==1) {
                reverseCombinations.add(combination);
                continue;
            }

            for (int i = 0, j = currentLetter; i < numLetters; i++, j--) {

                if(j == -1) {
                    j = words.length()-1;
                }

                if (currentLetter != j) {
                    combination += words.charAt(j);
                }
            }

            reverseCombinations.add(combination);
        }

        return reverseCombinations;
    }

}
