//12.	Find the Palindrome number

package assign.ment;

import java.util.Scanner;

public class Palindrome {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int originalNum = num;
		int reverseNum = 0;
		
		while(num!=0) {
			int digit = num % 10;
			reverseNum = reverseNum * 10 + digit;
			num = num / 10;
		}
		
		if(originalNum == reverseNum) {
			System.out.println("The number is a palindrome : "+ reverseNum);
		}else {
			System.out.println("The number is not a palindrome : " + reverseNum);
		}

	}

}
