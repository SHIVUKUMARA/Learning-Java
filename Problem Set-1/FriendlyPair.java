//25.	Friendly pair(, the ratio between the sum of divisors of a number and the number itself.)

package assign.ment;

import java.util.Scanner;

public class FriendlyPair {

	public static int factorsum(int n) {
		int res=0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				res+=i;
			}
		}
		return res;
	}
	public static int getratio(int a) {
		int fsum=factorsum(a);
		return fsum/a;
	}
	public static boolean isFriendlypair(int a,int b) {
		int x=getratio(a);
		int y=getratio(b);
		return x==y;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int a,b;
		System.out.println("Enter the first number: ");
		a=sc.nextInt();
		System.out.println("Enter the second number: ");
		b=sc.nextInt();
		if(isFriendlypair(a,b)) {
			System.out.println(a+" and "+b+" are friendly pairs");
		}
		else {
			System.out.println(a+" and "+b+" are not friendly pairs");
		}
	}

}
