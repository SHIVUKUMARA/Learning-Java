package com.api;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class SortArray {

	public static void main(String[] args) {
		int[] arr = {4, 5, 1, 7, 9, 8, 3, 6, 2};
		
		List<Integer> list = new ArrayList<>();
		for(int ele: arr) {
			list.add(ele);
		}

		List<Integer> collect = list.stream().sorted().collect(Collectors.toList());
		System.out.println(collect);
		
		List<Integer> collect2 = list.stream().sorted(Collections.reverseOrder()).collect(Collectors.toList());
        System.out.println(collect2);
	}

}
