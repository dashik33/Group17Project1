package group17Project;

public class Task2 {

	public static void main(String[] args) {
		// Create a 2D array of integer values. Print the sum of all numbers.

		int[][] numbers = { { 1, 2, 3, 4 }, { 10, 20 }, { 25, 35, 45, 55 }, { 300, 150, 150 } };

		int sum = 0;
		for (int i = 0; i < numbers.length; i++) {
			for (int j = 0; j < numbers[i].length; j++) {

				sum += numbers[i][j];
			}
		}
		System.out.println("The sum of all elements in the array is "+sum);
	}
}
