package com.problemset;

public class CopyOfArray {

	public static void main(String[] args) {
		int[] arr = {2, 5, 7, 8, 4, 1, 6, 9};
		int[] arr1 = new int[8];
		
		for(int i = 0; i < arr.length; i++) {
			arr1[i]=arr[i];
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr1[i]+ " ");
		}
	}

}
