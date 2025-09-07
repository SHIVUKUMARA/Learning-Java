package com.exception_Handling;

public class except1 {
    public static void m1(int num, int num2) {
    	int result = num/num2;
    	System.out.println("Calculating the value: "+ result);
    }
    
    public static void m2() {
    	//class.forName("com.mysql.cj.jdbc.Driver");  //checked exception-compile time error
    }
	public static void main(String[] args) {
        except1.m1(12, 0);
//		except1.m2();
	}

}
