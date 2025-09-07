package com.problemset;

public class CommanEleInTwoArray {

	public static void compareTwoInt(int[] arr1, int[] arr2) {
		for(int i = 0; i < arr1.length; i++) {
			for(int j = 0; j < arr2.length; j++) {
				if(arr1[i] == arr2[j]) {
					System.out.println(arr1[i]);
				}
			}
		}
	}
	
	public static void compareTwoStr(String[] arr3, String[] arr4) {
		for(int i = 0; i < arr3.length; i++) {
			for(int j = 0; j < arr4.length; j++) {
				if(arr3[i].equals(arr4[j])) {
					System.out.println(arr3[i]);
				}
			}
		}
	}
	
	public static void main(String[] args) {
		int[] arr1 = {1, 3, 5, 6, 7, 8, 9};
		int[] arr2 = {4, 5, 6, 7, 2, 8, 9};

		String[] arr3 = {"abc", "cba", "bca", "dga", "jkl"};
		String[] arr4 = {"cba", "bca", "dga", "lkj", "hgi"};
		
		compareTwoInt(arr1, arr2);
		compareTwoStr(arr3, arr4);
	}

}
