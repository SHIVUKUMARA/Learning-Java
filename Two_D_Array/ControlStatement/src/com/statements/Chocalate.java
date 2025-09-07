package com.statements;

import java.util.Scanner;

public class Chocalate {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter total choclate sold: ");
        int ch = sc.nextInt();
        
        double sold = (ch*2) - 200;
        if(ch > 100) {
        	System.out.println("Total amount is: " + sold);
        }else {
        	System.out.println("Total amount is: " + ch*1);
        }
	}

}
