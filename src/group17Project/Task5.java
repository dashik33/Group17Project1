package group17Project;

public class Task5 {

	public static void main(String[] args) {
		// Write a program to swap 2 numbers without a temporary variable.

		int a = 15;
		int b = 20;

		a = a - b; // a = 15-20 = -5
		b = a + b; // b = -5 + 20 = 15 
		a = b - a; // a = 15 - (-5) = 20

		System.out.println("The value of a is " + a + " and the value of b is " + b);

	}

}
