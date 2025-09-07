//4.	Find the Greatest of the Two Numbers in Java

package assign.ment;

import java.util.Scanner;

public class GreatestOfTwoNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number-1: ");
		int n1 = sc.nextInt();

		System.out.println("Enter the Number-2: ");
		int n2 = sc.nextInt();
		
		String result = (n1 > n2) ? (n1+" is Greaterthan "+n2) : (n2+" is Greaterthan "+n1);
		System.out.println(result);
		
//		if(n1>n2) {
//			System.out.println(n1+ " is Greaterthan "+n2);
//		}else {
//			System.out.println(n2 + " is Greaterthan "+ n1);
//		}
	}

}
