//3.	Binary to decimal conversion using Java

package in.problem;

import java.util.Scanner;

public class BinaryToDecimal {
	
	public static int conversion(String x) {
		int decimal_val = 0;
		int base = 1;
		
		for(int i = x.length()-1; i>=0; i--) {
			if(x.charAt(i) == '1') {
				decimal_val += base;
			}
			base *= 2;
		}
		return decimal_val;
	}

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Binary number : ");
		String x = sc.nextLine();
		
		System.out.println(conversion(x));

	}

}

//For Example: 
//If the binary number is 111. 
//dec_value = 1*(2^2) + 1*(2^1) + 1*(2^0) = 7