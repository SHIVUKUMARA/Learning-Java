package com.statements;

import java.util.Scanner;

public class Question17 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the total amount of distance: ");
		double x = sc.nextDouble();
		
		System.out.println("Enter theworking days in a week: ");
		double y = sc.nextDouble();
		
		System.out.println("Total distance travled per day is: " + x*2);
		
		System.out.println("Total Distance is : "+ (2*x)*y);

	}

}
