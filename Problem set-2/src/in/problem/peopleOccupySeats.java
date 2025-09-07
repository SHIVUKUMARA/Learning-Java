//13.	Permutations in which n people can occupy r seats in a classroom in java

package in.problem;

import java.util.Scanner;

public class peopleOccupySeats {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the decimal value: ");
        int n = sc.nextInt();
        
        System.out.println("Enter the decimal value: ");
        int r = sc.nextInt();
        
        //nPr = n!/(n-r)!
        int per, fact1, fact2;
        
        fact1 = 1;
        for(int i = n; i > 1; i=i-1) {
        	fact1 *= i;     //calculating factorial n!
        }
        int number = n-r;
        fact2 = 1;
        for(int i = number; i > 1; i = i-1) {
        	fact2 *= i;     // calculating factorial ((n-r)!)
        }
        per = fact1/fact2;   //calculating nPr
        System.out.println(per+ " ways");

	}

}
