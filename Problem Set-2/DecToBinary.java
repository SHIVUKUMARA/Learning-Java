//7.	Decimal to Binary conversion

package in.problem;

import java.util.Scanner;

public class DecToBinary {
	
	public static String binary(int x) { 
		      String b1 = Integer.toBinaryString(x);
		      return b1; 
	}
	
	public static void binary1(int x) {
		int bin = 0;  //to store converted binary number
		int rem;      //to store the remainder
		int rev = 1;  //printing the remainders in reverse order
		while(x > 0) {
			rem = x % 2;             // storing remainder  
			x = x / 2;               // dividing the given decimal value
			bin = bin + rem * rev;   
			rev = rev*10;            // reversing the remainders and storing it
		}
		System.out.println("The binary value of decimal number is : "+bin);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal value: ");
        int x = sc.nextInt();
        
        System.out.println("The binary value of decimal number is : "+binary(x));
        
        binary1(x);
	}

}
