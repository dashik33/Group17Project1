package group17Project;

import java.util.Scanner;

public class Task1 {

	public static void main(String[] args) {
		// Create an array on integer values using a scanner and calculate the sum of all stored elements in that array.

		Scanner input = new Scanner(System.in);
		System.out.println("Please enter an array length: ");
		
		int size = input.nextInt();
		int[] array = new int[size];
		
		System.out.println("Please enter integer elements for your array");

		for (int i = 0; i < size; i++) {
			array[i] = input.nextInt();
		}
		int sum = 0;
		for (int i = 0; i < size; i++) {
			sum += array[i];
		}

		System.out.println("The sum of all stored elements in an array is " + sum);
		input.close();
	}
}
