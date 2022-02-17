package group17Project;

public class Task6 {

	public static void main(String[] args) {
		// Write a java program to check whether a given number is prime or not.

		int num=181;
		boolean isPrime=false;
		
		 if(num==0||num==1){  
			   System.out.println(num+" is not a prime number");      
			  }else{  
		for (int i=2; i<=num/2; i++) {
			if (num%i==0) {
				System.out.println(num+" is not prime");
				isPrime=true;
				break;
			}
		}
		if (isPrime==false) {
			System.out.println(num+" is prime");
			}
		} 
		}
}