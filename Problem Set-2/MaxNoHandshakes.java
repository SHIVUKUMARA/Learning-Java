//14.	Maximum number of handshakes in java

package in.problem;

import java.util.Scanner;

public class MaxNoHandshakes {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enetr the number : ");
		int num = sc.nextInt();
		
		int handshakes = num * (num - 1) / 2;
		
		System.out.println("For "+ num +" people there will be " +handshakes+" handshakes");

	}

}
