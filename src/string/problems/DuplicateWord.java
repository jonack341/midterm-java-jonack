package string.problems;
import java.util.HashMap;
import java.util.Map;
public class DuplicateWord {

    public static void main(String[] args) {
        /*
         * Write a java program to find the duplicate words and their number of occurrences in the string.
         * Also Find the average length of the words.
         */

        String st = "Java is a programming Language. Java is also an Island of Indonesia. Java is widely used language";

        // Split the input string into words
        String[] words = st.split("\\s+");

        // Create a map to store word occurrences
        Map<String, Integer> wordCountMap = new HashMap<>();

        // Calculate the total word length and word count
        int totalLength = 0;
        int wordCount = 0;

        for (String word : words) {
            // Remove punctuation and convert to lowercase for case-insensitive comparison
            String cleanedWord = word.replaceAll("[^a-zA-Z]", "").toLowerCase();

            if (!cleanedWord.isEmpty()) {
                // Update word occurrences count
                wordCountMap.put(cleanedWord, wordCountMap.getOrDefault(cleanedWord, 0) + 1);

                // Update total word length and word count
                totalLength += cleanedWord.length();
                wordCount++;
            }
        }

        // Find and print duplicate words and their occurrences
        System.out.println("Duplicate words and their occurrences:");
        for (Map.Entry<String, Integer> entry : wordCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue() + " times");
            }
        }

        // Calculate and print the average word length
        double averageLength = (double) totalLength / wordCount;
        System.out.println("Average word length: " + averageLength);
    }
}