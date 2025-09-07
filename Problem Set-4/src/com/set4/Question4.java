//4.	Find the Union and Intersection of the two sorted arrays. 

package com.set4;

import java.util.Scanner;

public class Question4 {
	
	public static void Union(int[] arr1, int[] arr2) {
		int i = 0;
		int j = 0;
		while(i<arr1.length && j < arr2.length) {
			if(arr1[i] < arr2[j]) {
				System.out.print(arr1[i] + " ");
				i++;
			}else if(arr2[j] < arr1[i]) {
				System.out.print(arr2[j]+" ");
				j++;
			}else {
				System.out.print(arr1[i]+" ");
				i++;
				j++;
			}
		}
		while(i < arr1.length) {
			System.out.print(arr1[i]+" ");
			i++;
		}
		while(j < arr2.length) {
			System.out.print(arr2[j]+" ");
			j++;
		}
	}
	
	public static void Intersection(int[] arr1, int[] arr2) {
		int i = 0;
		 int j = 0; 
		 while(i < arr1.length && j < arr2.length) {
			 if(arr1[i]<arr2[j]) {
				 i++;
			 }else if(arr2[j] > arr1[i]) {
				 j++;
			 }else {
				 System.out.print(arr1[i] + " ");
				 i++;
				 j++;
			 }
		 }
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the length of arr1: ");
        int a1 = sc.nextInt();
        int[] arr1 = new int[a1];
        System.out.println("Enter the elements of arr1: ");
        for (int i = 0; i < a1; i++) {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the length of arr2: ");
        int a2 = sc.nextInt();
        int[] arr2 = new int[a2];
        System.out.println("Enter the elements of arr2: ");
        for (int i = 0; i < a2; i++) {
            arr2[i] = sc.nextInt();
        }
		
		System.out.println("The Union of elements is: ");
		Union(arr1, arr2);
		
		System.out.println("\nThe Intersection of elements is: ");
		Intersection(arr1, arr2);
	}  
}
