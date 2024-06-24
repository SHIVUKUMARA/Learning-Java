//6.	Find the Greatest of the Three Numbers in Java

package assign.ment;

import java.util.Scanner;

public class GreatestOfThreeNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter first number: ");
		int n1 = sc.nextInt();
		
		System.out.println("Enter second number: ");
		int n2 = sc.nextInt();
		
		System.out.println("Enter third number: ");
		int n3 = sc.nextInt();
		
//		int greatest;
//		if(n1 >= n2 && n1 >= n3) {
//			greatest = n1;
//		}else if(n2 >= n1 && n2 >= n3) {
//			greatest = n2;
//		}else {
//			greatest = n3;
//		}
		
	    int greatest = (n1 >= n2 && n1 >= n3) ? n1 : (n2 >= n1 && n2 >= n3) ? n2 : n3;
	    
	    System.out.println("The Greatest of three number is : " + greatest);
		}
}
