package com.problemset;

import java.util.Scanner;

public class IndexOfElement {

	public static void main(String[] args) {
		int[] arr = {25, 14, 56, 15, 36, 56, 77, 18, 29, 49};

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the element to find index : ");
		int ele = sc.nextInt();
		boolean found = false;

		for(int i = 0; i < arr.length; i++) {
			if(arr[i] == ele) {
				System.out.println("Index of element "+ ele + " is : " +i);
				found = true;
				break;
			}
		}
		if (!found) {
			System.out.println("Element " + ele + " not found in the array.");
		}
	}

}
