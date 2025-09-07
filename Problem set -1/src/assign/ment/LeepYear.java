//7.	Check Whether or Not the Year is a Leap Year in Java

package assign.ment;

import java.util.Scanner;

public class LeepYear {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Year: ");
		int year = sc.nextInt();
		
		if(year % 4 == 0) {
			if(year % 100 == 0) {
				if(year % 400 == 0) {
					System.out.println(year+" is a Leep Year");
				}else {
					System.out.println(year +" is not a Leep Year");
				}
			}else {
				System.out.println(year+" is a Leep Year");
			}
		}else {
			System.out.println(year+" is a not a Leep Year");
		}

	}

}
