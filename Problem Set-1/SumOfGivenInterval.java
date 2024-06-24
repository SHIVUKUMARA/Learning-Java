//5.	Find the Sum of the Numbers in a Given Interval in Java

package assign.ment;

import java.util.Scanner;

public class SumOfGivenInterval {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
        int n1 = sc.nextInt();
        
        System.out.println("Enter the Number: ");
        int n2 = sc.nextInt();
        
        int sum = 0;
        for(int i = n1; i <= n2; i++) {
        	sum += i;  //sum=sum+i
        }
        System.out.println("The sum of Interval is: " + sum);

	}

}
