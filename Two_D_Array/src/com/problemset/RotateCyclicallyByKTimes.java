package com.problemset;

public class RotateCyclicallyByKTimes {
	
	public static void rotateByOne(int[] arr) {
		int lastele = arr[arr.length-1];
		for(int i = arr.length-1; i > 0; i--) {
			arr[i] = arr[i-1];
		}
		arr[0] = lastele;
	}
	
	public static void rotateByKthTime(int[] arr, int k) {
		int n = arr.length;
		k = k % n;
		for(int i = 0; i < k; i++) {
			rotateByOne(arr);
		}
		
		for(int data : arr) {
			System.out.print(data+" ");
		}
	}

	public static void main(String[] args) {
		int[] arr = {10, 20, 30, 40, 50, 60};
		int k = 3;
		
		rotateByKthTime(arr, k);

	}

}
