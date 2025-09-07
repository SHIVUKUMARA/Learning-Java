//10.	Binary to Octal conversion

package in.problem;

import java.util.Scanner;

public class BinaryToOctal {
	
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
	
	// Method to convert decimal integer to octal string
    public static void octal(int decimal) {
    	int octal[] = new int[20];
		int i = 0;
		while(decimal > 0)
		{
			int r = decimal % 8;
			octal[i++] = r;
			decimal = decimal / 8;
		}
		System.out.print("Octal number : ");
		for(int j = i-1 ; j >= 0 ; j--)
		System.out.print(octal[j]); 
    }

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the binary value: ");
		String x = sc.nextLine();
		
		int binary = conversion(x);
		
		octal(binary);

	}

}
