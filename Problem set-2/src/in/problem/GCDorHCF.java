//1.	Java Program to find GCD or HCF of two numbers

package in.problem;

import java.util.Scanner;

public class GCDorHCF {
	
	public static int gcd(int x, int y) {
		if(y == 0)
			return x;
		return gcd(y, x%y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int x = sc.nextInt();
		
		System.out.println("Enter the second number: ");
		int y = sc.nextInt();	
		
		int result = gcd(x,y);
        System.out.println(result);
	}

}
