package com.statements;

import java.util.Scanner;

public class Test_14 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total 5 rupees coins: ");
		int x = sc.nextInt();
		
		System.out.println("Enter total 10 rupees coins: ");
		int y = sc.nextInt();
		
		System.out.println("Enter cost for one chocolate: ");
		double z = sc.nextDouble();
		
		int cal = x*5 + y*10;
		if(x>=0 && y>=0) {
			System.out.println("Total amount you have is: "+ cal);
		}else {
			System.out.println("You don't have enough money!!!");
		}
		System.out.println("Total chocolate chef can buy is: "+ cal / z);

	}

}
