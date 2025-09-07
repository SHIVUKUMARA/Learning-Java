package com.statements;

import java.util.Scanner;

public class Question19 {
	
	public static void rightAngleTriangle(int n) {
		System.out.println("It is Right Angle Triangle");
		for(int i = 1; i <= n; i++) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void leftAngleTriangle(int n) {
		System.out.println("It is Left Angle Triangle");
		for(int i = 1; i<=n; i++) {
			for(int j = i; j < n; j++) {
				System.out.print("   ");
			}
			for(int k = 1; k<=i; k++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void reverseRightAngleTriangle(int n) {
		System.out.println("It is reverse Right Angle Triangle");
		for(int i = n; i >= 1; i--) {
			for(int j = 1; j <= i; j++) {
				System.out.print("*"+" ");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void reverseLeftAngleTriangle(int n) {
		System.out.println("It is reverse Left Angle Triangle");
		for(int i = n; i >= 1; i--) {
			for(int j = i; j < n; j++) {
				System.out.print("   ");
			}
			for(int k = 1; k<=i; k++) {
				System.out.print(" * ");
			}
			System.out.println();
		}
		System.out.println();
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the rows: ");
		int n = sc.nextInt();
		
		rightAngleTriangle(n);
		leftAngleTriangle(n);
		reverseRightAngleTriangle(n);
		reverseLeftAngleTriangle(n);
	}

}
