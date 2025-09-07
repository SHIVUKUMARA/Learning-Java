package com.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class StartsFromTwo {

	public static void main(String[] args) {
		int[] arr = {21, 12, 23, 222, 123, 212, 453, 245};
		List<Integer> list = new ArrayList<>();
		
		for(int ele : arr) {
			list.add(ele);
		}
		
        List<Integer> collect = list.stream()
        .map(x -> String.valueOf(x))
        .filter(x->x.startsWith("2"))
        .map(x->Integer.parseInt(x))
        .collect(Collectors.toList());
        
        System.out.println(collect);
	}

}
