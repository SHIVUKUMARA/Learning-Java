//24.	Abundant number(If the sum of all its proper divisors, denoted by sum(n),
//      is greater than the number's value)


package assign.ment;

import java.util.Scanner;

public class AbundantNumber {

	public static int sum(int n) {
		int res=0;
		for(int i=1;i<n;i++) {
			if(n%i==0)res+=i;
		}
		return res;
	}
	public static boolean isAbundant(int n) {
		int sum=sum(n);
		return sum>n;
	}
	
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int n;
		System.out.println("Enter the number: ");
		n=sc.nextInt();
		if(isAbundant(n))System.out.println(n+" is a abundant number");
		else System.out.println(n+" is not a abundant number");
	}

}
