package com.practice;
import java.util.Scanner;

public class SelectionSort {
	
	public static void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void Selectionsort(int[] arr) {
		int n = arr.length;
		
		for(int i = 0; i < n-1; i++) {
			int minIndex = i;
			
			for(int j = i+1; j<n; j++) {
				if(arr[minIndex]>arr[j]) {
					minIndex = j;
				}
			}
			
			if(minIndex != i) {
				int temp = arr[i];
				arr[i] = arr[minIndex];
				arr[minIndex] = temp;
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

		Selectionsort(arr);
		
		System.out.print("After Selection sort : ");
		printArr(arr);
		
		sc.close();
	}

}
