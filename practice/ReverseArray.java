package com.practice;
import java.util.*;

public class ReverseArray {
	
	public static void reverse(int[] arr) {
		int n = arr.length;
		
		for(int i = 0; i < n / 2; i++) {
			int temp = arr[i];
			arr[i] = arr[n - 1 - i];
			arr[n - 1 - i] = temp;
		}
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the Array elements : ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		reverse(arr);
		
		System.out.println("Reversed Array is : ");
		for(int num : arr) {
			System.out.print(num+" ");
		}
		
		sc.close();
	}

}
