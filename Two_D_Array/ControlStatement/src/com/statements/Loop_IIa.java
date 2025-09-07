package com.statements;

public class Loop_IIa {
	
    static int count = 0;
    
    public static int countOfDigit(int n) {
//    	while(n > 0) {
//    		int rem = n%10;
//    		count++;
//    		n = n/10;
//    	}
//    	return count;
    	
    	//using recursion
    	if (n == 0) {
            return 0;
        } else {
            return 1 + countOfDigit(n / 10);
        }
    }
    
	public static void main(String[] args) {
      System.out.println(countOfDigit(9876543));
	}

}
