package com.practice;
import java.util.Scanner;

public class ReverseString {
	
	public static void reverseWord(String str) {
		String[] words = str.split(" ");
		int n = words.length-1;
		
		System.out.print("Reversed words are : ");
		for(int i = n; i>=0; i--) {
			System.out.print(" "+ words[i]);
		}
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the string to reverse : ");
		String str = sc.nextLine();
		
		String reversed = "";
		for(int i = str.length()-1; i >= 0; i--) {
			reversed += str.charAt(i);
		}

		System.out.println("The Original String is : "+ str);
		System.out.println("The Reversed string is : "+reversed);
		
		reverseWord(str);
		
		sc.close();

	}

}
