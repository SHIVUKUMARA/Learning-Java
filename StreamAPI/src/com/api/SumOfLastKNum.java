package com.api;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SumOfLastKNum {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8, 9};
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number: ");
		int k = sc.nextInt();
		
		List<Integer> list = new ArrayList<>();
		for(int ele : arr) {
			list.add(ele);
		}
		
		long size = list.stream().count();
		Integer reduce = list.stream().skip(size-k).reduce(0, (sum, x)->sum+x);
		System.out.println(reduce);
	}

}
