package com.algorithm;

public class SelectionSort {
	
	public static void selection(int[] arr) {
		for(int i = 0; i <arr.length-1; i++) {
			int smallest = i;
			for(int j = i+1; j < arr.length; j++) {
				if(arr[smallest] > arr[j]) {
					smallest = j;
				}
			}
			int temp = arr[smallest];
			arr[smallest] = arr[i];
			arr[i] = temp;
		}
		System.out.println("Selection sort of array is : ");
		for(int data:arr) {
			System.out.print(data+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr = {7, 8, 3, 1, 2};
		
		selection(arr);

	}

}
