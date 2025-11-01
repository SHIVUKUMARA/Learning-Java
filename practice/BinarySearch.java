package com.practice;
import java.util.*;

public class BinarySearch {
	
	public static int binarySearch(int[] arr, int target) {
		int low = 0;
		int high = arr.length-1;
		
		while(low <= high) {
			int mid = low + (high-low)/2;
			
			if(arr[mid] == target) {
				return mid;
			}else if(arr[mid] < target){
				low = mid+1;
			}else {
				high = mid - 1;
			}
		}
		return -1;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("Enter the size of the array : ");
		int n = sc.nextInt();
		
		int[] arr = new int[n];
		System.out.println("Enter the array elements : ");
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		
		System.out.println("Enter the target element to find : ");
		int target = sc.nextInt();
		
		Arrays.sort(arr);
		
		int index = binarySearch(arr, target);
		
		if(index != -1) {
			System.out.println("The Element "+ target +" found at index : "+ index);
	    }else {
			System.out.println("The Element " + target + " is not found in Array");
		}
		
		sc.close();
	}

}
