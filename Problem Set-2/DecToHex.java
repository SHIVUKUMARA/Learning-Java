//9.	Decimal to Hexadecimal Conversion

package in.problem;

import java.util.Scanner;

public class DecToHex {
	
	public static String toHex(int x) {
		int rem;
		String hex = "";
		char hexchar[] = {'0','1','2','3','4','5','6','7','8','9','A','B','C','D','E','F'};
		while(x > 0) {
			rem = x % 16;
			hex = hexchar[rem]+hex;
			x = x / 16;
		}
		return hex;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Decimal value: ");
		int x = sc.nextInt();
		
		//method-1
		System.out.println(Integer.toHexString(x)); 
		
		//method-2
		System.out.println("The hexadeximal value of "+x+ " is: "+toHex(x));
	}

}
