package com.practice;
import java.util.Scanner;

public class LinearSearch {
	
	public static int linearSearch(int[] arr, int target) {
		int n = arr.length;
		
		for(int i = 0; i < n; i++) {
			if(arr[i] == target) {
				return i;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Size of an Array: ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the Array Elements: ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the Element to find in the Array : ");
		int target = sc.nextInt();
		
		int index = linearSearch(arr, target);
		
		if(index != -1) {
		   System.out.println("The Element "+ target +" found at index : "+ index);
		}else {
			System.out.println("The Element " + target + " is not found in Array");
		}
        sc.close();
	}

}
