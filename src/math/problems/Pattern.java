package math.problems;

public class Pattern {

	public static void main(String[] args) {
		/* Read this numbers, find the pattern then implement the logic from this pattern.which will give you this output.
		 * 100,99,98,97,96,95,94,93,92,91,90,88,86,84,82,80,78,76,74,72,70,67,64,61,58,55,52,49,46,43,40,36,32............
		 *
		 *
		 */
		//define starting value and ending value
		int currentValue = 100;
		int decrement = 1;

		while (currentValue >= 0) {
			System.out.print(currentValue);

			// Add a comma and space until the last number
			if (currentValue > 0) {
				System.out.print(", ");
			}

			// define the pattern of the decrement
			if (currentValue > 90) {
				decrement = 1;
			} else if (currentValue > 80) {
				decrement = 2;
			} else if (currentValue > 70) {
				decrement = 3;
			} else if (currentValue > 60) {
				decrement = 4;
			} else if (currentValue > 50) {
				decrement = 5;
			} else if (currentValue > 40) {
				decrement = 6;
			} else if (currentValue > 30) {
				decrement = 7;
			} else if (currentValue > 20) {
				decrement = 8;
			} else if (currentValue > 10) {
				decrement = 9;
			}

			currentValue -= decrement;
		}
	}
}