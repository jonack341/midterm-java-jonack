package math.problems;

public class FindMissingNumber {

    public static void main(String[] args) {
        /*
         * If n = 10, then array will have 9 elements in the range from 1 to 10.
         * For example {10, 2, 1, 4, 5, 3, 7, 8, 6}. One number will be missing in array (9 in this case).
         * Write java code to find the missing number from the array. Write static helper method to find it.
         */
        int [] array = new int[]{10, 2, 1, 4, 5, 3, 7, 8, 6};
        int n = 10;
        //   int[] arr = {10, 2, 1, 4, 5, 3, 7, 8, 6};
        int missingNumber = findMissingNumber(array, n);

        System.out.println("The missing number is: " + missingNumber);
    }

    public static int findMissingNumber(int[] array, int n) {
        // Calculate the sum of all numbers from 1 to n
        int totalSum = (n * (n + 1)) / 2;

        // Calculate the sum of elements in the array
        int arraySum = 0;
        for (int num : array) {
            arraySum += num;
        }

        // The missing number is the difference between totalSum and arraySum
        int missingNumber = totalSum - arraySum;

        return missingNumber;
    }
}