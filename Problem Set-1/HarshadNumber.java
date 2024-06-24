//23.	Harshad number(number which is divisible by the sum of its digits)

package assign.ment;

import java.util.Scanner;

public class HarshadNumber {

	public static int sumofDigits(int n) {
		int res=0;
		while(n>0) {
			res+=n%10;
			n/=10;
		}
		return res;
	}
	public static boolean isHarshad(int n) {
		int sum=sumofDigits(n);
		return n%sum==0;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		if(isHarshad(n))System.out.println(n+" is a Harshad number");
		else System.out.println(n+" is not a Harshad number");
	}

}
