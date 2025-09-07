package com.list;

import java.util.PriorityQueue;

public class KthElement {

	public static void KthSmalestElement(int[] arr, int k) {
		PriorityQueue<Integer> queue = new PriorityQueue<>();
		int counter = 0;
		int smallestElement = 0;
		for(int i: arr) {
			queue.add(i);
		}
		
		while(counter < k) {
			int element = queue.poll();
			smallestElement = element;
			counter++;
		}
		
		System.out.println(smallestElement);
	}
	
	public static void main(String[] args) {
		int[] arr = {20, 30, 15, 5, 8};
		int k = 3;
     
		KthSmalestElement(arr, k);
	}

}
