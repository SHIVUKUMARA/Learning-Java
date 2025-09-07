//15.	Add two fractions using Java

package in.problem;

import java.util.Scanner;

public class AddTwoFraction {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number Numerator: ");
		int num1 = sc.nextInt();
		
		System.out.println("Enter the first number Denominator: ");
		int den1 = sc.nextInt();
		
		System.out.println("Enter the second number Numerator: ");
		int num2 = sc.nextInt();
		
		System.out.println("Enter the second number Denominator: ");
		int den2 = sc.nextInt();
		
		System.out.print("("+num1+" / "+den1+") + ("+num2+" / "+den2+") = ");
		
		int num, den, x;
		if(den1 == den2) {
			num = num1+num2;
			den = den1;
		}else {
			num = (num1*den2) + (num2*den1);
			den = den1 * den2;
		}
		if(num > den) {
			x = num;
		}else {
			x = den;
		}
		for(int i = 1; i <= x; i++) {
			if(num%i == 0 && den%i == 0) {
				num = num/i;
				den = den/i;
			}
		}
		int n = 1;
		int p = num;
		int q = den;
		if( num != den)
		{
			while(n != 0)
			{
				n = num % den;			
				if(n != 0)
				{
					num = den;
					den = n;
				}
			}			
		}
        System.out.print("("+p/den+" / "+q/den+")");
	}

}
