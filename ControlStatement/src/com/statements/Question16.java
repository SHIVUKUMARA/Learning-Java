package com.statements;

import java.util.Scanner;

public class Question16 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the value of A: ");
		int A = sc.nextInt();
		
		if(A % 2 == 0 && A % 7 == 0) {
			System.out.println("Alice takes " + A + " value to home");
		}else if(A % 2 != 0 && A % 9 == 0) {
			System.out.println("Bob takes " + A + " value to home");
		}else {
			System.out.println("Charlie takes " + A + " value to home");
		}

	}

}
