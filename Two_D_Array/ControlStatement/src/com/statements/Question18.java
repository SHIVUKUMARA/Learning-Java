package com.statements;

import java.util.Scanner;

public class Question18 {
	
//	public static int reverseNumber(int num, int rem) {
//		if(num == 0) {
//			return rem;
//		}
//		rem = rem*10 + rem%10;
//		return reverseNumber(num/10);
//		
//	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number without space: ");
		int num = sc.nextInt();
		
//		int rem = 0;
//		reverseNumber(num, rem);
		
		int rem = 0;
		while(num > 0) {
			rem = rem*10 + num % 10;
			num = num/10;
		}
		System.out.println(rem);

	}

}
