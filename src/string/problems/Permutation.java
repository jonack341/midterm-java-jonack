package string.problems;

public class Permutation {

    public static void main(String[] args) {
        /*
         * Permutation of String "ABC" is "ABC" "BAC" "BCA" "ACB" "CAB" "CBA".
         * Write Java program to compute all Permutation of a String
         *
         */
        String input = "ABC";
        generatePermutations(input, 0, input.length() - 1);
    }

    public static void generatePermutations(String input, int left, int right) {
        if (left == right) {
            System.out.println(input);
        } else {
            for (int i = left; i <= right; i++) {
                input = swap(input, left, i);
                generatePermutations(input, left + 1, right);
                input = swap(input, left, i); // Backtrack
            }
        }
    }

    public static String swap(String input, int i, int j) {
        char[] charArray = input.toCharArray();
        char temp = charArray[i];
        charArray[i] = charArray[j];
        charArray[j] = temp;
        return String.valueOf(charArray);
    }
}