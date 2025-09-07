package com.problemset;

public class RemoveDuplicateEle {

	public static void main(String[] args) {
		int[] arr = {3, 4, 6, 8, 9, 7, 2, 4};
		int unique = arr.length;
		for(int i = 0; i < unique; i++) {
			for(int j = i+1; j < unique; j++) {
				if(arr[i] == arr[j]) {
					arr[j] = arr[unique-1];
					unique--;
					j--;
				}
			}
		}
		 System.out.println("Array after removing duplicates:");
	        for (int i = 0; i < unique; i++) {
	            System.out.print(arr[i] + " ");
	        }

	}

}
