//2.	LCM of two numbers using Java

package in.problem;

import java.util.Scanner;

public class LCM {
	
	public static int gcd(int x, int y) {
		if(y == 0) {
			return x;
		}
		return gcd(y, x%y);
	}
	
	public static int lcm(int x, int y) {
		return Math.abs(x*y)/gcd(x,y);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the first number: ");
		int x = sc.nextInt();

		System.out.println("Enter the second number: ");
		int y = sc.nextInt();

		int ans = (x > y) ? x : y;

		while (true) {
			if (ans % x == 0 && ans % y == 0) {
				break;
			}
			ans++;
		}
		System.out.println("LCM of " + x + " and " + y + " is : " + ans);
		
		int result = lcm(x,y);
		System.out.println("Using GCD approach the LCM of "+x+ " and "+y+ " is : "+ result);

	}

}
