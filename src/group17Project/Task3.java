package group17Project;

public class Task3 {

	public static void main(String[] args) {
		/*
		 * Create a 2D array of integer type where you will store odd and even numbers.
		 * Develop a program which will identify/print the even numbers only.
		 */

		int[][] array = { { 56, 67, 89, 34 }, { 45, 130 }, { 90, 91, 115 } };

		for (int i = 0; i < array.length; i++) {
			for (int j = 0; j < array[i].length; j++) {
				if (array[i][j]%2==0) {
					System.out.print(array[i][j]+" ");
				}else {
			}
	}
		}
}
}