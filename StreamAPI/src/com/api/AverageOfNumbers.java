package com.api;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class AverageOfNumbers {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7};
		
		List<Integer> list = new ArrayList<>();
		for(int ele : arr) {
			list.add(ele);
		}

		//average
		IntStream result = list.stream().mapToInt(x->x);
		double asDouble = result.average().getAsDouble();
		System.out.println(asDouble);
	}

}
