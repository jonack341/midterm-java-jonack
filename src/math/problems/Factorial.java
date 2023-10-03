package math.problems;
import java.util.Scanner;
public class Factorial {

    public static void main(String[] args) {
        /*
         * Factorial of 5! = 5 x 4 X 3 X 2 X 1 = 120.
         * Write a java program to find Factorial of a given number using Recursion as well as Iteration.
         *
         */
        //Utilize scanner to accept user input value
        Scanner scanner = new Scanner(System.in);
        //Utilize repeat to repeat the code once an instance is finished
        char repeat;
        //Keep in do/while loop for the code to repeat based on user input
        do {
            //Utilize long variable as answer will be larger than int
            long number;
            //do/while loop to repeat the user input
            do {
                System.out.print("Enter a positive integer to calculate its factorial: ");
                while (!scanner.hasNextLong()) {
                    System.out.println("Invalid input. Please enter a positive integer.");
                    scanner.next(); // Consume the invalid input
                }
                number = scanner.nextLong();
                //Utilize if statement to keep user input as a positive value
                if (number < 0) {
                    System.out.println("Please enter a positive integer.");
                }
            } while (number < 0);

            // Calculate factorial using recursion
            long factorialRecursive = calculateFactorialRecursive(number);
            System.out.println("Factorial using recursion: " + factorialRecursive);

            // Calculate factorial using iteration
            long factorialIterative = calculateFactorialIterative(number);
            System.out.println("Factorial using iteration: " + factorialIterative);
            //Utilize while statement to execute part of code while asking user if they would like to continue with another value
            while (true) {
                System.out.print("Do you want to enter another number? (y/n): ");
                repeat = scanner.next().charAt(0);
                if (repeat == 'y' || repeat == 'n') {
                    break;
                } else {
                    System.out.println("Invalid input. Please enter 'y' or 'n'.");
                }
            }

        } while (repeat == 'y');

        System.out.println("Goodbye!");
        scanner.close();
    }

    // Recursive method to calculate factorial
    public static long calculateFactorialRecursive(long n) {
        if (n == 0 || n == 1) {
            return 1;
        } else {
            return n * calculateFactorialRecursive(n - 1);
        }
    }

    // Iterative method to calculate factorial
    public static long calculateFactorialIterative(long n) {
        long factorial = 1;
        for (long i = 1; i <= n; i++) {
            factorial *= i;
        }
        return factorial;
    }
}