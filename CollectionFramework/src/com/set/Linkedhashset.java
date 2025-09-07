package com.set;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class Linkedhashset {

	public static void main(String[] args) {
		Set<Integer> set = new LinkedHashSet<>();
		set.add(20);
		set.add(10);
		set.add(40);
		set.add(10);
		set.add(null);

		System.out.println(set);
		
		for(Integer ele:set) {
			System.out.println(ele);
		}
		
		Iterator<Integer> itr = set.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next());
		}
		
		System.out.println("---------------------------------");
		
		int[] arr = {1, 2, 3};
		int[] arr2 = {4, 5, 6};
		Set<Integer> lhs = new LinkedHashSet<>();
		for(int i = 0; i < arr.length; i++) {
			lhs.add(arr[i]);
		}
		
		for(int i = 0; i < arr2.length; i++) {
			lhs.add(arr2[i]);
		}
		
		System.out.println(lhs);
		
		
	}
}