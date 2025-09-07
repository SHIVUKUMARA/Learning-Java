package com.statements;

import java.util.Scanner;

public class Bonus {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Salary: ");
		int salary = sc.nextInt();
		
		System.out.println("Enter Year of Service: ");
		int service = sc.nextInt();
		
		double bonus = salary + (salary * 0.05);
		if(service > 5) {
			System.out.println("Net bonus amount is: " + bonus);
		}else {
			System.out.println("salary is: " + salary);
		}

	}

}
