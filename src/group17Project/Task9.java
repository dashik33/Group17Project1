package group17Project;

public class Task9 {

	public static void main(String[] args) {
		// Write a java program to find the second largest number in the array.
		
		int[] array = {56, 78, 1000, 346, 24, 90, 978, 789, 999, 2000};
		int largest=array[0];
		int secondLargest=array[0];
		
		for (int i=0; i<array.length; i++) {
			if (array[i]>largest) {
				secondLargest=largest;
				largest=array[i];
			}else if (array[i]>secondLargest) {
				secondLargest=array[i];
			}
		}
		System.out.println(secondLargest);
	}
}
		
	