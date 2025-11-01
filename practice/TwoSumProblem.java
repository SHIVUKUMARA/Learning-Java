package com.practice;

import java.util.Scanner;

public class TwoSumProblem {
	
	public static void twoSum(int[] arr, int target) {
		boolean found = false;
		for(int i = 0; i < arr.length-1; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i]+arr[j] == target) {
					System.out.println("The elements are : "+ arr[i] +" and " + arr[j]);
					found = true;
				}
			}
		}
		
		if(!found)
		System.out.println("No elements sum is equal to target!");
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the array Elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the sum to find elements : ");
		int target = sc.nextInt();
		
		twoSum(arr, target);
		
		sc.close();
	}

}
