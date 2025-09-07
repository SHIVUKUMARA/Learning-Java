package com.statements;
import java.util.Scanner;

public class Discount {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Quantity: ");
		int qty = sc.nextInt();
		
		System.out.println("Enter the Unit: ");
		double unit = sc.nextDouble();
		
		double totalCost = qty * unit;
        if(totalCost > 1000) {
        	totalCost = totalCost - (totalCost * 0.10);
        	System.out.println(totalCost);
        }
        
	}

}
