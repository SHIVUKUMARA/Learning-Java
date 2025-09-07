package com.problemset;

public class SumOfArray {

	public static void main(String[] args) {
		int[] arr = {1, 4, 6, 7, 8, 9, 3, 2, 5, 10};

		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		System.out.println("Sum of array is : "+ sum);
	}

}
