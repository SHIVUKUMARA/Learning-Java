//10.	Find the Sum of the Digits of a Number in Java Language

package assign.ment;

import java.util.Scanner;

public class SumofDigitOfNum {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the numbers: ");
        int num = sc.nextInt();
        
        int sum = 0;
        while(num!=0) {
        	sum += num%10;
        	num = num/10;
        }
        System.out.println("The sum of the digits is: " + sum);
	}

}
