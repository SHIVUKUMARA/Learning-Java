package com.problemset;

public class MoveAllZeroToEnd {

	public static void main(String[] args) {
		int[] arr = { 0, 2, 0, 4, 0, 0, 3, 1, 0, 0, 0, 7 };

		System.out.println("Original array:");
		for (int data : arr) {
			System.out.print(data + " ");
		}

		int index = 0;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] != 0) {
				arr[index++] = arr[i];
			}
		}

		while (index < arr.length) {
			arr[index++] = 0;
		}

		System.out.println("\nArray after moving zeros to the end:");
		for (int data : arr) {
			System.out.print(data + " ");
		}
	}
}
