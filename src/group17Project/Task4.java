package group17Project;

public class Task4 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integers. Develop a program which will calculate the sum
		 * of even and odd numbers for that array.
		 */

		int[][] array = { { 60, 6, 35, 34 }, { 95, 100 }, { 10, 31, 215 } };
		int sumEven = 0;
		int sumOdd = 0;

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
			
				if (array[i][j] % 2 == 0) {
					sumEven += array[i][j];
				} else {
					sumOdd += array[i][j];
				}
			}
		}
		System.out.println("The sum of all even numbers in the array is " + sumEven);
		System.out.println("The sum of all odd numbers in the array is " + sumOdd);
		
	}
}
