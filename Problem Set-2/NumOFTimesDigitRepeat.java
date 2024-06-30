//23.	Finding Number of times x digit occurs in a given input

package in.problem;

import java.util.Scanner;

public class NumOFTimesDigitRepeat {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number : ");
		int n = sc.nextInt();
		
		System.out.println("Enter the number want to find: ");
		int f = sc.nextInt();
		
		int count = 0;
		while(n > 0) {
			int rem = n % 10;
			if(rem == f) {
				count++;
			}
			n= n / 10;
		}
		System.out.println(count);

	}

}
