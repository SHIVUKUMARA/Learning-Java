package com.set;

import java.util.HashSet;
import java.util.Set;

public class Sets {

	public static void main(String[] args) {
		Set<Integer> set = new HashSet<>();
		
		set.add(100);
		set.add(12);
		set.add(56);
		set.add(129);
		set.add(2);
		set.add(100); // doesn't display twice beause it does not allow duplicate element
		System.out.println(set);
	}

}
