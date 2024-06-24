//8.	Write a program to check if a given number is prime or not in java

package assign.ment;

import java.util.Scanner;

public class PrimeOrNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		if (n <= 1) {
			System.out.println("The Number " + n + " is not a prime number");
		} else {
			boolean isPrime = true;  
			
			for (int i = 2; i <= Math.sqrt(n); i++) {
				if (n % i == 0) {
					System.out.println("The Number " + n + " is not a prime number");
					isPrime = false;
					break;
				}
			}
			
			if (isPrime) {
				System.out.println("The Number " + n + " is a prime number");
			}
		}
		sc.close();
	}
}
