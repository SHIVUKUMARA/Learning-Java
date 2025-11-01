package com.practice;

import java.util.Scanner;

public class MaxMinArray {
	
	public static void maxMin(int[] arr) {
		int max = arr[0];
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] > max) {
				max = arr[i];
			}
			
			if(arr[i] < min) {
				min = arr[i];
			}
		}
		
		System.out.println("The Maximum element in array is : "+ max +" and Minimum element is : "+ min);
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
		
		maxMin(arr);
        
		sc.close();
	}

}
