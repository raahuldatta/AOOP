package com.anagramchecker;

import java.util.Scanner;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Anagram Checker program.
 * 
 * This program takes a word and a list of words as input, and checks if any of the words in the list are anagrams of the input word.
 */
public class anagramchecker {

    /**
     * Main method to run the program.
     * 
     * @param args command line arguments (not used)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word: ");
        String word = scanner.nextLine();
        System.out.println("Enter a list of words: ");
        String[] words = scanner.nextLine().split(" ");
        scanner.close();
        anagramChecker(word, words);
    }

    /**
     * Checks if any of the words in the list are anagrams of the input word.
     * 
     * @param word the input word to check for anagrams
     * @param words the list of words to check against
     */
    public static void anagramChecker(String word, String[] words) {
        List<String> anagrams = new ArrayList<>();
        for (String w : words) {
            if (isAnagram(word, w)) {
                anagrams.add(w);
            }
        }
        System.out.println("Anagrams: " + anagrams);
    }

    /**
     * Checks if two words are anagrams of each other.
     * 
     * @param word1 the first word to check
     * @param word2 the second word to check
     * @return true if the words are anagrams, false otherwise
     * 
     * Example: isAnagram("listen", "silent") returns true
     */
    public static boolean isAnagram(String word1, String word2) {
        char[] word1Array = word1.toLowerCase().toCharArray();
        char[] word2Array = word2.toLowerCase().toCharArray();
        Arrays.sort(word1Array);
        Arrays.sort(word2Array);
        return Arrays.equals(word1Array, word2Array);
    }
}