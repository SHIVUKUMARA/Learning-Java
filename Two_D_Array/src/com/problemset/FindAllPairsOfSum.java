package com.problemset;

import java.util.Scanner;

public class FindAllPairsOfSum {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the sum to find pairs of number: ");
		int sum = sc.nextInt();
		
		int[] arr = {1, 4, 5, 7, 8, 9, 6, 3, 2};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] + arr[j] == sum) {
					System.out.println(arr[i]+ " + " +arr[j]+ " = "+ sum);
				}
			}
		}

	}

}
