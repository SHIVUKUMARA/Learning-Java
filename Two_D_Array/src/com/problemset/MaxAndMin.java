package com.problemset;

public class MaxAndMin {
	
	public static void MaxAndMinWithoutSorting(int[] arr) {
		
		int Max= Integer.MIN_VALUE;
		int Min = Integer.MAX_VALUE;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > Max) {
				Max = arr[i];
			}
		}
		
		System.out.println("Maximum element is : "+Max);
		
		for(int j = 0; j < arr.length; j++) {
			if(arr[j] < Min) {
				Min = arr[j];
			}
		}
		
		System.out.println("Minimum element is : "+Min);
	}
	
	public static void MaxAndMinWithSorting(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[j] > arr[i]) {
					int temp = arr[j];
					arr[j] = arr[i];
					arr[i] = temp;
				}
			}
		}
			System.out.println("Maximum element is : "+ arr[0]);
			System.out.println("Minimum element is : "+ arr[arr.length-1]);
	}

	public static void main(String[] args) {
		int[] arr = {3, 5, 7, 9, -1, 6, 8, 2};
		
		MaxAndMinWithoutSorting(arr);
		MaxAndMinWithSorting(arr);

	}

}
