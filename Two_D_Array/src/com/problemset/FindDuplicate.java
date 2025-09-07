package com.problemset;

public class FindDuplicate {

	public static void findDuplicateInteger(int[] arr) {
		for(int i = 0; i< arr.length; i++) {
			for(int j = i+1; j < arr.length; j++) {
				if(arr[i] == arr[j]) {
					System.out.println(arr[i]);
				}
			}
		}
	}
	
	public static void findDuplicateString(String[] arr1) {
		for(int i = 0; i< arr1.length; i++) {
			for(int j = i+1; j < arr1.length; j++) {
				if(arr1[i].equals(arr1[j])) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr = {3, 6, 8, 8, 4, 5, 7, 6};
		String[] arr1 = {"bcd", "abd", "jude", "bcd", "oiu", "gzw", "oiu"};
		
		findDuplicateInteger(arr);
		findDuplicateString(arr1);

	}

}
