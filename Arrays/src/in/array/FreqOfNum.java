package in.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class FreqOfNum {

	public static void duplicateElements(int[] arr) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
//		add all elements of an array to map
		
		for(int data:arr) {
			if(map.containsKey(data)) {
				map.put(data, map.get(data)+1);
			}else {
				map.put(data, map.getOrDefault(data, 1));
			}
		}
		//Traverse:Map.Entry() --> used for traversing hash table
		
		System.out.println("For Repeating Elements: ");
		for(Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
			if(entrySet.getValue()>1) {
				System.out.println(entrySet.getKey());
			}
		}
		
		System.out.println("For Kay-Value pairs with their occurance:");
		for(Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
			System.out.println(entrySet.getKey()+" "+ entrySet.getValue());
		}
		
		//non repeating element
		System.out.println("For Non-Repeating Elements: ");
		for(Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
			if(entrySet.getValue() == 1) {
				System.out.println(entrySet.getKey());
			}		}
	}
	
	public static void main(String[] args) {
		int [] arr = {1,2,3,4,2,1,6,5,6,1};
		
		duplicateElements(arr);

	}

}
