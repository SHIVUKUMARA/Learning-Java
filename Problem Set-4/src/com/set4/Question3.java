//3.	Move all the negative elements to one side of the array 

package com.set4;

public class Question3 {
    
	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}
	
	public static void shift(int[] arr) {
		int j = 0;
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] < 0) {
				if(i != j) {
					swap(arr, i, j);
					j++;
				}
			}
		}
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void main(String[] args) {
       int[] arr = {3, -1, 7, -8, 9, 2, -1, 5, 4, 6, -2};
       shift(arr);
	}

}
