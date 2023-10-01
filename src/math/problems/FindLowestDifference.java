package math.problems;

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
        int minDifference = Integer.MAX_VALUE;

        for (int num1 : array1) {
            for (int num2 : array2) {
                int difference = Math.abs(num1 - num2);
                if (difference < minDifference) {
                    minDifference = difference;
                }
            }
        }

        System.out.println("The lowest difference between the two arrays is: " + minDifference);
    }
}