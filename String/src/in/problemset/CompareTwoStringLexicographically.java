package in.problemset;

import java.util.Scanner;

public class CompareTwoStringLexicographically {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the str1 : ");
		String str1 = sc.nextLine();
		System.out.println("Enter the str2 : ");
		String str2 = sc.nextLine();
		
		int result = str1.compareToIgnoreCase(str2);
		System.out.print(result);
		
		if(result < 0) {
			System.out.print(" - str1 is lessthan str2");
		}else if(result == 0) {
			System.out.print(" - Both the strings are equal");
		}else {
			System.out.print(" - str1 is greaterthan str2");
		}
	}

}
