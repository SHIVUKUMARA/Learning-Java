//	Check Whether a Number is Even or Odd in Java

package assign.ment;

import java.util.Scanner;

public class EvenOrOdd {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
		int n = sc.nextInt();
		
		if(n % 2 == 0) {
			System.out.println(n + " is a EvenNumber ");
		}else {
			System.out.println(n + " is a OddNumber");
		}

	}

}
