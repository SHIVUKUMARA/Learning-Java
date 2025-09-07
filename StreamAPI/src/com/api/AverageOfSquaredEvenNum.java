package com.api;

import java.util.ArrayList;
import java.util.List;

public class AverageOfSquaredEvenNum {

	public static void main(String[] args) {
		int[] arr = {1, 2, 3, 4, 5, 6, 7, 8};
		
		List<Integer> list = new ArrayList<>();
		for(int ele : arr) {
			list.add(ele);
		}

		double asDouble = list.stream()
				                 .filter(num -> num % 2 == 0)
				                 .map(num -> num*num)
				                 .mapToInt(num -> num)
				                 .average()
				                 .getAsDouble();
		
		System.out.println(asDouble);
	}

}
