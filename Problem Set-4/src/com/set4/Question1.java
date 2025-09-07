//  1.	Given an array which consists of only 0, 1 and 2. 
//      Sort the array without using any algorithm  

package com.set4;

public class Question1 {
	public static void sortValues(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			int flag = 0;
			for (int j = 0; j < arr.length - 1 - i; j++) {
				if (arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
					flag = 1;
				}
			}
			if (flag == 0) {
				break;
			}
		}
		System.out.println("Bubble sort of array is : ");
		for (int data : arr) {
			System.out.print(data + " ");
		}
		System.out.println("\n");
	}

	public static void main(String[] args) {
		int[] arr = {1, 2, 0};
		sortValues(arr);
	}

}
