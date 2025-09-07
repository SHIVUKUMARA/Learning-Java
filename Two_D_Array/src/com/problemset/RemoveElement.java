package com.problemset;

import java.util.Scanner;

public class RemoveElement {

	public static void main(String[] args) {
		int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to remove : ");
		int remove = sc.nextInt();
		
		int index = -1;
		
		// Find the index of the element to remove
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == remove) {
				index = i;
				break;
			}
		}
		
		// If element found, shift elements to the left
		if(index != -1) {
			for(int i = index; i < arr.length -1; i++) {
				arr[i] = arr[i+1];
			}
		}else {
			System.out.println("Element not found");
		}
		
		System.out.println("Array after removing the element:");
		for(int i = 0; i < arr.length - 1; i++) {
			System.out.print(arr[i] + " ");
		}
	}

}
