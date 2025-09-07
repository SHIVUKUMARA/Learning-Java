//17.  Factorial of a number

package assign.ment;

import java.util.Scanner;

public class FactorialOfNum {

	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number greaterthan 1: ");
        int n = sc.nextInt();
        
        int result = 1;
        for(int i = 2; i<=n; i++) {
        	result *= i;
        }
        System.out.println(result);
	}

}
