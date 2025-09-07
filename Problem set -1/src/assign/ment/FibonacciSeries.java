//15.	Fibonacci Series upto nth term

package assign.ment;

import java.util.Scanner;

public class FibonacciSeries {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number: ");
        int num = sc.nextInt();
        
        if(num <= 0) {
        	System.out.println("please enter the positive number!!!");
        }else {
        	System.out.println("Fibonacci series up to "+ num + " terms: ");
        }
        
        int firstNum = 0;
        int secondNum = 1;
        
        for(int i = 1; i <= num; i++) {
        	System.out.print(firstNum+", ");
        	
        	int nextNum = firstNum + secondNum;
        	firstNum = secondNum;
        	secondNum = nextNum;
        }
	}

}
