//6.	Hexadecimal to Decimal conversion

package in.problem;

import java.util.Scanner;

public class HexaToDecimal {
	
	public static int hextodec(String x) {

	        int decimal = 0; 
	        for (int i = 0; i < x.length(); i++) { 
	            char c = x.charAt(i); 
	            int digit = Character.digit(c, 16); 
	            decimal = decimal * 16 + digit; 
	        } 
	        return decimal; 
	}

	public static void main(String[] args) {
        
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the HexaDecimal value : ");
		String x = sc.nextLine();
		
		int base = 1;
		int decimal_val = 0;
		
		for(int i = x.length() -1; i >= 0; i--) {
			if(x.charAt(i) >= '0' && x.charAt(i) <= '9') {
				decimal_val += (x.charAt(i) - 48) * base;
				base *= 16;
			}else if(x.charAt(i) >= 'A' && x.charAt(i) <= 'F') {
				decimal_val += (x.charAt(i) - 55) * base;
				base *= 16;
			}
		}
		System.out.println(decimal_val);
		
		
		System.out.println(hextodec(x));
	}

}


//1AB in decimal is 427
//1A in decimal is 26
