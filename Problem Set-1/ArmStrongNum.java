package assign.ment;

import java.util.Scanner;

public class ArmStrongNum {
	
	public static void armStrongNumber(int n) {

		int temp = n, sum = 0;
		while (temp > 0) {
			int rem = temp % 10;
			sum = sum + (rem * rem * rem);
			temp = temp / 10;
		}
		if (n == sum) {
			System.out.println("ArmStrong Number");
		} else {
			System.out.println("Not a ArmStrong Number");
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter three digit number: ");
		int num = sc.nextInt();

		sc.close();

		armStrongNumber(num);

	}

}
