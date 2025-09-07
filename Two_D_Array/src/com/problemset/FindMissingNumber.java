package com.problemset;

public class FindMissingNumber {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 6, 7};
		
		int totalNum = 7;
		
		int sumOfNum = totalNum * (totalNum + 1) / 2 ;
		
		int sum = 0;
		
		for(int i = 0; i < arr.length; i++) {
			sum = sum + arr[i];
		}
		
		int missingNum = sumOfNum - sum;
		System.out.println("Missing Number is : "+ missingNum);

	}

}
