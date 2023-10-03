package math.problems;

import java.util.ArrayList;
import java.util.List;

public class LowestNumber {

	public static void main(String[] args) {
		/*
		 * Write java solution to find the lowest number from this array.
		 * Use the mysql databases to store and to retrieve.
		 */
		int array[] = new int[]{211, 110, 99, 34, 67, 89, 67, 456, 321, 456, 78, 90, 45, 32, 56, 78, 90, 54, 32, 123, 67, 5, 679, 54, 32, 65};

		//find lowest number from the array
		int lowestNumber = findLowestNumber(array);

		// Store the values from the array in a list
		List<Integer> numberList = new ArrayList<>();
		for (int num : array) {
			numberList.add(num);
		}

		// Store the lowest number in the database
		//storeLowestNumberInDatabase(lowestNumber);

		// Retrieve the values from the database into a list
		//List<Integer> retrievedNumberList = retrieveNumbersFromDatabase();

		// Print the results
		System.out.println("The lowest number in the array is: " + lowestNumber);
		//	System.out.println("The values retrieved from the database are: " + retrievedNumberList);
	}

	static int findLowestNumber(int[] array) {
		int lowestNumber = array[0]; // Initialize with the first element

		for (int i = 1; i < array.length; i++) {
			if (array[i] < lowestNumber) {
				lowestNumber = array[i]; // Update if a smaller element is found
			}
		}

		return lowestNumber;
	}
}

//	private static void storeLowestNumberInDatabase(int lowestNumber) {
//		// JDBC connection parameters
//		String jdbcUrl = "jdbc:mysql://localhost:3306/midterm";
//		String username = "root";
//		String password = "123456";
//
//		try {
//			// Establish a database connection
//			Connection connection = DriverManager.getConnection(jdbcUrl, username, password);
//
//			// Insert the lowest number into the database
//			String insertQuery = "INSERT INTO lowest_numbers (value) VALUES (?)";
//			PreparedStatement insertStatement = connection.prepareStatement(insertQuery);
//			insertStatement.setInt(1, lowestNumber);
//			insertStatement.executeUpdate();
//
//			// Close resources
//			insertStatement.close();
//			connection.close();
//
//		} catch (SQLException e) {
//			e.printStackTrace();
//		}
//	}
//
//	}