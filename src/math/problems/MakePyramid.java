package math.problems;

public class MakePyramid {
    public static void main(String[] args) {

        /*   Implement a large Pyramid of stars in the screen with java.

         *
         * *
         * * *
         * * * *
         * * * * *
         * * * * * *

         */
        // Define how many rows of pyramid you want in total
        int n = 36;

        // Define the outer number of rows
        for (int i = 1; i <= n; i++) {

            // Define how to print the spaces
            for (int j = 1; j <= n - i; j++) {
                System.out.print(" ");
            }

            // Define what character to use to print out pyramid
            for (int k = 1; k <= i; k++) {
                System.out.print("* ");
            }

            // Code used to move to next line to print
            System.out.println();
        }
    }
}