//11.	Find the Reverse of a number

package assign.ment;

import java.util.Scanner;

public class ReverseOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int reverseNum = 0;
		
		while(num!=0) {
			int digit = num % 10;
			reverseNum = reverseNum * 10 + digit;
			num = num / 10;
		}
		System.out.println("The reverse of the number is: " + reverseNum);
	}

}
