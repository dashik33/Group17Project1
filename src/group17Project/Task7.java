package group17Project;

public class Task7 {

	public static void main(String[] args) {
		// Write a Java Program to print the first 10 numbers of Fibonacci series.

		int n1=1; // 1st num of Fibonacci
		int n2=1; //2nd num of Fibonacci
		int n3; // adding a variable
		
		System.out.print(n1+" "+n2+" "); //printing two first numbers
		for (int i=3; i<=10; i++) {
			n3=n1+n2; // n3=1+1 = 2
	System.out.print(n3+" "); //printing 3rd number
	n1=n2; // reassigning 
	n2=n3; // n3 is the sum of n1 and n2
		}
		System.out.print(" "); //printing all the numbers
	}

}
