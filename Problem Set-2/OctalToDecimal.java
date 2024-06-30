//5.	Octal to Decimal conversion

package in.problem;

import java.util.Scanner;

public class OctalToDecimal {
	
	public static void octal(String n) {
		int num = Integer.parseInt(n,8);
		System.out.println("The value of octal "+n+" to decimal is : "+ num);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
       System.out.println("Enter the Input: ");
       String n = sc.nextLine();
       
       octal(n);
	}

}


//For Example:
//In Octal: 167
//In Decimal: (1 * 8^2) + (6 * 8^1) + (7 * 8^0) = 119
