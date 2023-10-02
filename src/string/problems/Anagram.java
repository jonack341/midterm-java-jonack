package string.problems;
import java.util.Arrays;
public class Anagram {

    public static void main(String[] args) {
        //Write a Java Program to check if the two String are Anagram. Two String are called Anagram when there is
        //same character but in different order.For example,"CAT" and "ACT", "ARMY" and "MARY".
        String word1 = "EARTH";
        String word2 = "HEART";

        // Utilize boolean statement to check in a 'equal' format.
        boolean areAnagrams = areAnagrams(word1, word2);

        // Prints out the letters of word1 and word2
        System.out.println("Letters in " + word1 + ": " + Arrays.toString(getLetters(word1)));
        System.out.println("Letters in " + word2 + ": " + Arrays.toString(getLetters(word2)));

        // Check if they are anagrams and contain the same letters
        if (areAnagrams) {
            System.out.println("\n" + word1 + " and " + word2 + " are anagrams because they contain the same letters.");
        } else {
            System.out.println("\n" + word1 + " and " + word2 + " are not anagrams because they do not contain the same letters.");
        }
    }

    // Checks to see if two words are anagrams
    public static boolean areAnagrams(String word1, String word2) {
        // Remove spaces and convert to lowercase for case-insensitive comparison
        word1 = word1.replaceAll("\\s", "").toLowerCase();
        word2 = word2.replaceAll("\\s", "").toLowerCase();

        // Check if the sorted strings are equal
        return sortString(word1).equals(sortString(word2));
    }

    // Sorts the string
    private static String sortString(String str) {
        char[] charArray = str.toCharArray();
        Arrays.sort(charArray);
        return new String(charArray);
    }

    // Gets each individual letters of a word
    private static char[] getLetters(String word) {
        // Removes spaces & converts to lowercase for case-insensitive comparison
        word = word.replaceAll("\\s", "").toLowerCase();
        char[] letters = word.toCharArray();
        Arrays.sort(letters);
        return letters;
    }
}