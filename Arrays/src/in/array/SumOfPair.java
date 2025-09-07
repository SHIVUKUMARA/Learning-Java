package in.array;

import java.util.Scanner;

public class SumOfPair {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sum : ");
		int sum = sc.nextInt();
		
		for(int i = 0; i< arr.length; i++) {
			for(int j = i+1; j<arr.length; j++) {
				int total = arr[i]+arr[j];
				if(total == sum) {
					System.out.println("The possible pairs are: "+arr[i]+ " " +arr[j]);
				}
			}
		}

	}

}
