package com.practice;
import java.util.*;

public class JumpSearch {
	
	public static int jumpSearch(int[] arr, int target) {
		int n = arr.length;
		int step = (int) Math.sqrt(n);
		int prev = 0;
		
		while(Math.min(step, n)-1 < target) {
			prev = step;
			step += (int) Math.sqrt(n);
			if(prev >= n) {
				return -1;
			}
		}
		
		for(int i = prev; i < Math.min(step, n); i++) {
			if(arr[i] == target) {
				return i;
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
		
		int index = jumpSearch(arr, target);
		
		if(index != -1) {
			System.out.println("The Element "+ target +" found at index : "+ index);
	    }else {
			System.out.println("The Element " + target + " is not found in Array");
		}
		
		sc.close();
	}

}
