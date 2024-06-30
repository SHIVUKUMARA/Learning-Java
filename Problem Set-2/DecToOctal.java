//8.	Decimal to Octal Conversion

package in.problem;

import java.util.Scanner;

public class DecToOctal {
	
	public static void octal(int x) {
		int bin = 0;  //to store converted binary number
		int rem;      //to store the remainder
		int rev = 1;  //printing the remainders in reverse order
		while(x > 0) {
			rem = x % 8;             // storing remainder  
			x = x / 8;               // dividing the given decimal value
			bin = bin + rem * rev;   
			rev = rev*10;            // reversing the remainders and storing it
		}
		System.out.println("The binary value of decimal number is : "+bin);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal value: ");
		int x = sc.nextInt();
		
		//method-1
		System.out.println(Integer.toOctalString(x));
		
		//method-2
		octal(x);

	}

}
