//20.	Calculate the number of digits in an integer

package in.problem;

import java.util.Scanner;

public class NumOfDigits {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int num = sc.nextInt();
		
		int digit = 0;
		while(num != 0) {
			int lastNum = num % 10;
			digit++;
			num = num / 10;
		}
        System.out.println(digit);
	}

}