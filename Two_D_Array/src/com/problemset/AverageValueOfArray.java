package com.problemset;

public class AverageValueOfArray {

	public static void main(String[] args) {
		int[] arr = {20, 30, 25, 35, -16, 60, -100};

		int sum = 0;
		for(int i = 0; i < arr.length; i++) {
			sum = sum+arr[i];
		}
		
		double average = sum / arr.length;
		
		System.out.println("Average of Array is : "+average);
	}

}
