package com.problemset;

public class DfBtLargestAndSmallest {

	public static void main(String[] args) {
		int[] arr = {40, 77, 89, 99, 73, 64, 43};
		
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		int difference = arr[arr.length-1] - arr[0];
		System.out.println("The difference between the largest and smallest element is: "+ difference);

	}

}
