//20.	Strong number (sum of factorial of digits is equals to number itself)

package assign.ment;

import java.util.Scanner;

public class StrongNumber {
  
	public static int fact(int n) {
		if(n==1) {
			return 1;
		}
		return n*fact(n-1);
	}
	public static boolean isStrong(int n) {
		int res=0;
		int temp=n;
		while(n>0) {
			res+=fact(n%10);
			n=n/10;
		}
		
		return res==temp;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		if(isStrong(n)) {
			System.out.println(n+" is a strong number");
		}
		else {
			System.out.println(n+" is not a strong number");
		}
	}

}
