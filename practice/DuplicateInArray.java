package com.practice;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class DuplicateInArray {

	public static void duplicate(int[] arr) {
		int n = arr.length;

		for (int i = 0; i < n - 1; i++) {
			for (int j = i + 1; j < n; j++) {
				if (arr[i] == arr[j]) {
					System.out.print(arr[i] + " ");
				}
			}
		}
	}

	public static void duplicateFreq(int[] arr) {
		HashMap<Integer, Integer> freqMap = new HashMap<>();

		for (int num : arr) {
			freqMap.put(num, freqMap.getOrDefault(num, 0) + 1);
		}

		System.out.println("The duplicate elements are : ");

		for (Map.Entry<Integer, Integer> entry : freqMap.entrySet()) {
			if (entry.getValue() > 1) {
				System.out
						.println("The Element " + entry.getKey() + " appeared " + entry.getValue() + " times in array");
			}
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();

		int[] arr = new int[n];
		System.out.println("Enter the array Elements : ");
		for (int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		System.out.println("\nThe duplicate elements are : ");
		duplicate(arr);
		
		duplicateFreq(arr);

		sc.close();
	}

}
