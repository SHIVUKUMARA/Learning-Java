package com.problemset;

public class SumOfAllThreeEle {

	public static void main(String[] args) {
		int[] arr = {1, -2, 0, 5, -1, -4};
        int target = 2;
        
        for(int i = 0; i < arr.length; i++) {
        	for(int j = i; j < arr.length; j++) {
        		for(int k = j; k < arr.length; k++) {
                	if(arr[i]+arr[j]+arr[k] == target) {
                		System.out.print("["+ arr[i]+","+ arr[j]+","+ arr[k]+"]");
                	}
                }
            }
        }

	}

}
