//21.	Perfect number (a positive integer that is equal to the sum of its proper divisors)

package assign.ment;

import java.util.Scanner;

public class PerfectNumber {

	public static boolean isPerfect(int n) {
		int res=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				res+=i;
			}
		}
		return res==n;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		if(isPerfect(n)) {
			System.out.println(n+" is a perfect number");
		}
		else {
			System.out.println(n+" is not a perfect number");
		}

	}

}
