package math.problems;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FindLowestDifference {
    public static void main(String[] args) {
        /*
         Implement in java.
         Read this below two array. Find the lowest difference between the two array cell.
         The lowest difference between cells is 1
        */
        int [] array1 = {30,12,5,9,2,20,33,1};
        int [] array2 = {18,25,41,47,17,36,14,19};
        //declare lowDifference with array1 and array2 values
        int lowDifference = findLowestDifference(array1, array2);
        //Print out the array1 and array2 values
        System.out.print("Given the following arrays: ");
        printArray(array1);
        System.out.print(" and ");
        printArray(array2);
        //Print out the lowest difference
        System.out.println("\nThe lowest difference between the two arrays is: " + lowDifference);
    }

    public static int findLowestDifference(int[] arr1, int[] arr2) {
        //find the max value of array1 and array2
        int lowDiff = Integer.MAX_VALUE;
        //Use for loop to find the difference
        for (int i = 0; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                int diff = Math.abs(arr1[i] - arr2[j]);
                if (diff < lowDiff) {
                    lowDiff = diff;
                }
            }
        }

        return lowDiff;
    }

    public static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.print("]");
    }

    static class FindLowestDifferenceTest {
        @Test
        public void testFindLowestDifference() {
            int[] array1 = {30, 12, 5, 9, 2, 20, 33, 1};
            int[] array2 = {18, 25, 41, 47, 17, 36, 14, 19};

            int result = findLowestDifference(array1, array2);

            // The expected lowest difference is 1
            int expected = 1;
            assertEquals(expected, result);

        }
    }
}
