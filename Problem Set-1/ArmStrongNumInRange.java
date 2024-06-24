//14.	Find all Armstrong number in a given range 

package assign.ment;

import java.util.Scanner;

public class ArmStrongNumInRange {
	
	public static boolean isArmstong(int num) {

		
		int temp = num;
		int count = 0, rem;
		while (temp > 0) {
			rem = temp % 10;
			count++; 
			temp /= 10;
		}

		temp = num;
		double sum = 0;
		while (temp > 0) {
			rem = temp % 10;
			sum = sum + Math.pow(rem, count);
			temp /= 10;
		}

		if (sum == num) {
			return true;
		} else {
			return false;
		}

	}

	public static void armstrongGivenRange(int start, int end) {

		System.out.println("Armstrong Number from the range " + start + " to " + end);
		for (int i = start; i <= end; i++) {
			if (isArmstong(i)) {
				System.out.print(i + " ");
			}
		}
	}
	
	public static void main(String[] args) {
       
		Scanner sc = new Scanner(System.in);

		System.out.print("Enter the start number (from 100): ");
		int num1 = sc.nextInt();

		System.out.print("Enter the end number: ");
		int num2 = sc.nextInt();

		sc.close();

		armstrongGivenRange(num1, num2);

	}

}
