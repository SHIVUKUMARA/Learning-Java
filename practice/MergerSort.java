package com.practice;
import java.util.*;

public class MergerSort {

	public static void printArr(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			System.out.print(arr[i]+" ");
		}
	}
	
	public static void Mergesort(int[] arr, int left, int right) {
		if(left >= right) return;
		
		int mid = (left + right) / 2;
		Mergesort(arr, left, mid);
		Mergesort(arr, mid+1, right);
		
		merge(arr, left, mid, right);
	}
	
	public static void merge(int[] arr, int left, int mid, int right) {
		int[] temp = new int[right - left +1];
		int i = left;
		int j = mid+1;
		int k = 0;
		
		while(i <= mid && j <= right) {
			if(arr[i] < arr[j]) {
				temp[k] = arr[i];
				i++;
			}else {
				temp[k] = arr[j];
				j++;
			}
			k++;
		}
		
		while(i <= mid) {
			temp[k] = arr[i];
			i++;
			k++;
		}
		
		while(j <= right) {
			temp[k] = arr[j];
			j++;
			k++;
		}
		
		for(int p = 0; p < temp.length; p++) {
			arr[left+p] = temp[p];
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

		Mergesort(arr, 0, n-1);
		
		System.out.print("After Selection sort : ");
		printArr(arr);
		
		sc.close();
	}

}
