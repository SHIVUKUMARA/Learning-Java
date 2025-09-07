package com.problemset;

import java.util.Scanner;

public class AddTwoArray {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the number of columns: ");
		int m = sc.nextInt();
		
		System.out.println("Enter the number of rows: ");
		int n = sc.nextInt();
		
		int arr1[][] = new int[m][n];
		int arr2[][] = new int[m][n];
		int sum[][] = new int[m][n];
		
		System.out.println("Input elements of first matrix are: ");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr1[i][j] = sc.nextInt();
			}
		}
		
		System.out.println("Input elements of second matrix are: ");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				arr2[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				sum[i][j] = arr1[i][j]+arr2[i][j];
			}
		}
		
		System.out.println("Sum of two array is : ");
		for(int i = 0; i < m; i++) {
			for(int j = 0; j < n; j++) {
				System.out.print(sum[i][j]+"\t");
			}
			System.out.println();
		}

	}

}
