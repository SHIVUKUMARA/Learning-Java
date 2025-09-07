package in.str;

import java.util.Scanner;

public class ConvertToUpperCase {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter something: ");
		String str = sc.nextLine();
		
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			ch = (char)(ch - 32);
			System.out.print(ch);
		}
		
		System.out.println("\n----------------------------");
		//another method to convert it to upperCase() is 
		System.out.println(str.toUpperCase());
		sc.close();
	}

}
