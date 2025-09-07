//1.	Check if a Number is Positive or Negative in Java

package assign.ment;

import java.util.Scanner;

public class PositiveorNot {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int n = sc.nextInt();
		
		if(n > 0) {
			System.out.println("The number " + n +" is Positive");
		}else if(n < 0) {
			System.out.println("The number " + n +" is Negative");
		}else {
			System.out.println("The number " + n +" is neither Positive nor Negative");
		}

	}

}
