package com.problemset;

public class CheckIsTwoArrayEqual {

	public static void isEqual(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] > arr[j]) {
					int temp = arr[i];
					arr[i] = arr[j];
					arr[j] = temp;
				}
			}
		}
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+ " ");
		}
	}
	
	public static boolean areArrayEqual(int[] arr1, int[] arr2) {
		if(arr1.length != arr2.length) {
			return false;
		}
		for(int i = 0; i < arr1.length; i++) {
			if(arr1[i] != arr2[i]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int[] arr1 = { 6, 4, 8, 7, 9, 1 };
		int[] arr2 = { 8, 9, 7, 1, 6, 4 };

		System.out.print("Array 1: ");
		isEqual(arr1);
		System.out.println();
		System.out.print("Array 2: ");
		isEqual(arr2);
		
		System.out.println("\n");
		if(areArrayEqual(arr1, arr2)) {
			System.out.println("Both the arrays are equal.");
		}else {
			System.out.println("Both arrays are not equal.");
		}
	}

}
