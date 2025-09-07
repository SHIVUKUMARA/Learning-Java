//Write a Java program to compute the average value of an array of integers except
//the largest and smallest values.

package com.problemset;

public class AverageOfArray {

	public static void main(String[] args) {
		int[] arr  = {77, 87, 98, 54, 63, 21, 93, 74, 62, 51};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = 0; j < arr.length; j++) {
				if(arr[i] < arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int sum = 0;
		for(int i = 1; i < arr.length-1; i++) {
			sum += arr[i];
		}
		int average = sum / arr.length;
		System.out.println(average);
	}

}
