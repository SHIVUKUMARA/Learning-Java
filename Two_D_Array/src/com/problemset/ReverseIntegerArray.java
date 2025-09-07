package com.problemset;

public class ReverseIntegerArray {

	public static void main(String[] args) {
		int[] arr = {3, 5, 7, 9, 6, 4, 2, 1};
		
		for(int i = arr.length-1; i>= 0; i-- ) {
			System.out.print(arr[i]+" ");
		}

	}

}
