package com.practice;
import java.util.*;

public class HashingSearch {
	
	public static boolean hashingSearch(int[] arr, int target) {
		HashSet<Integer> set = new HashSet<>();
		
		for(int num : arr) {
			set.add(num);
		}
		
		return set.contains(target);
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
		
		
		boolean found = hashingSearch(arr, target);
		
		if(found) {
			System.out.println("The Element "+ target +" is found in array");
	    }else {
			System.out.println("The Element " + target + " is not found in Array");
		}
		
		sc.close();
	}

}
