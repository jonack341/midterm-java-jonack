package string.problems;

import java.util.HashMap;
import java.util.Map;

public class DetermineLargestWord {
    public static void main(String[] args) {
        /*
         Implement to Find the length and longest word in the given sentence below.
         Should return "10 biological".
         */
        String s = "Human brain is a biological learning machine";
        Map<Integer, String> wordNLength = findTheLargestWord(s);

        int maxLength = 0;
        String longestWord = "";

        for (Map.Entry<Integer, String> entry : wordNLength.entrySet()) {
            int wordLength = entry.getKey();
            String word = entry.getValue();

            if (wordLength > maxLength) {
                maxLength = wordLength;
                longestWord = word;
            }
        }

        System.out.println("Longest word: " + longestWord);
        System.out.println("Length of the longest word: " + maxLength);
    }

    public static Map<Integer, String> findTheLargestWord(String s) {
        String[] words = s.split(" ");
        Map<Integer, String> wordNLength = new HashMap<>();

        for (String word : words) {
            int wordLength = word.length();
            wordNLength.put(wordLength, word);
        }

        return wordNLength;
    }
}