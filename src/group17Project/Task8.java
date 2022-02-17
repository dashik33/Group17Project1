package group17Project;

public class Task8 {

	public static void main(String[] args) {
		// Write a Java program that identifies maximum and minimum number in the array.

		int[] array = { 56, 67, 9, 45, 29, 73, 2000, 950, 16 };
		int maxNum = array[0];
		int minNum = array[0];

		for (int i = 0; i < array.length; i++) {
			if (array[i] > maxNum) {
				maxNum = array[i];
			}
		}
		System.out.println(maxNum + " is the maximum number in the array");

		System.out.println("");

		for (int i = 0; i < array.length; i++) {
			if (array[i] < minNum) {
				minNum = array[i];
			}
		}
		System.out.println(minNum + " is the minimum number in the array");
	}
}
