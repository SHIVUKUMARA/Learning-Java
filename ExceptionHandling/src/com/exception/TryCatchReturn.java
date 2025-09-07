package com.exception;
//try and catch with return statement
public class TryCatchReturn {

	public static int m1(int num1, int num2) {
		try {
			int result = num1/num2;
			return result;
		}catch(Exception e) {
			return -1;
		}
	}
	
	public static void main(String[] args) {
		
       System.out.println(TryCatchReturn.m1(12, 0));
	}

}
