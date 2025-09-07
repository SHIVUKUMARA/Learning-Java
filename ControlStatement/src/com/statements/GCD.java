package com.statements;

public class GCD {

	public static String hcf(int a, int b) {
		if (b == 0) {
			System.out.println(a);
		} 
		return hcf(b, a % b);
	}

	public static void main(String[] args) {
        
		hcf(12,33);
		
	}

}
