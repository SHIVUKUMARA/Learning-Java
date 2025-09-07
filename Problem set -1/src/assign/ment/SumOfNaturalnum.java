//3.	Find the Sum of First N Natural Numbers in Java

package assign.ment;

import java.util.Scanner;

public class SumOfNaturalnum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        
        int sum = 0;
        for(int i = 0; i <= n; i++) {
        	sum += i;  //sum=sum+i
        }
        System.out.println("The sum of first " + n + " Natural number is " + sum);
	}

}
