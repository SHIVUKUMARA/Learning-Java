//19.	Factor of a number

package assign.ment;

import java.util.Scanner;

public class FactorOfNum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Number: ");
        int n = sc.nextInt();
        
        if(n <= 0) {
        	System.out.println("Please enter a positive number!!!");
        	return;
        }
        
        for(int i = 1; i <= n; i++) {
        	if(n % i == 0) {
        		System.out.print(i+" ");
        	}
        }
        System.out.println();
	}

}
