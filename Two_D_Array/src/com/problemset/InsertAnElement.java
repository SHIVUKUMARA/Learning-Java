package com.problemset;

import java.util.Scanner;

public class InsertAnElement {
	
	public static void WithoutLoosingEle(int[] arr, int[] arr1, int ind, int ele) {
	        
	        for (int i = 0; i < ind; i++) {
	            arr1[i] = arr[i];
	        }
	        
	        arr1[ind] = ele;
	        
	        for (int i = ind; i < arr.length; i++) {
	            arr1[i + 1] = arr[i];
	        }
	        
	        System.out.println("Array after inserting the element:");
	        for (int i = 0; i < arr1.length; i++) {
	            System.out.print(arr1[i]+" ");
	        }
		
	}

	public static void main(String[] args) {
		int[] arr = {2, 5, 6, 7, 9, 0, 1};
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the index position of element : ");
		int ind = sc.nextInt();
		
		System.out.println("Enter the element to insert: ");
		int ele = sc.nextInt();
		
		for(int i = ind; i > arr.length; i++) {
			arr[i+1] = arr[i];
		}
		
		arr[ind] = ele;
		
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
		
		System.out.println("\n-------------------------");
		
		int[] arr1 = new int[arr.length+1];
		
		WithoutLoosingEle(arr, arr1, ind, ele);

	}

}
