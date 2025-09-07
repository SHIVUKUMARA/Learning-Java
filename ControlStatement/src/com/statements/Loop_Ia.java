package com.statements;
import java.util.Scanner;

public class Loop_Ia {
    public static void print(int num) {
    	for(int i = 1; i<= 10; i++) {
        	System.out.println(num +"x" + i + " = "+ num*i);
        }
    }
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        print(num);
	}

}
