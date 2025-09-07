package com.api;

import java.util.ArrayList;
import java.util.List;

public class SumOfArray {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5};
		
		List<Integer> list = new ArrayList<>();
		for(int ele:arr) {
			list.add(ele);
		}
		
		Integer reduce = list.stream().reduce(0,(sum,x)->sum+x);
		System.out.println(reduce);

	}

}
