package com.practice;

import java.util.Scanner;

public class InsertionSort {

	public static void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void Insertionsort(int[] arr) {
		int n = arr.length;
		
		for(int i = 1; i < n; i++) {
			for(int j = i; j>0; j--) {
				if(arr[j] < arr[j-1]) {
					int temp = arr[j];
					arr[j] = arr[j-1];
					arr[j-1] = temp;
				}else {
					break;
				}
			}
		}
	}
	
	public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
		
		System.out.print("Enter the size of array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.print("Enter the Elements of array : ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}

		Insertionsort(arr);
		
		System.out.print("After Selection sort : ");
		printArr(arr);
		
		sc.close();
	}

}
