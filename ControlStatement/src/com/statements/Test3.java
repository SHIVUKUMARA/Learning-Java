package com.statements;

// check positive even number

public class Test3 {
	    public static boolean isEven(int num) {
	    	boolean flag = false;
	    	if(num > 0 && num % 2 == 0) {
	    		flag = true;
	    	}
	    	return flag;
	    }
	public static void main(String[] args) {
      System.out.println(isEven(12));
	}

}
