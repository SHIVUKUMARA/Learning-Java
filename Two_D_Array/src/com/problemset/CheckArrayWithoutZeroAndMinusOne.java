package com.problemset;

public class CheckArrayWithoutZeroAndMinusOne {

	public static boolean check(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == 0 || arr[i] == -1) {
				return true;
			}
		}
		return false;
	}
	
	public static void main(String[] args) {
		int[] arr1 = {33, 99, 34, 94, 79, 60, 31, 27};
		int[] arr2 = {77, 0, 43, 28, 64};

		System.out.println(check(arr1));
		System.out.println(check(arr2));
	}

}
