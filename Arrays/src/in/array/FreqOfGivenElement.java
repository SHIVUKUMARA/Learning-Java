package in.array;

import java.util.LinkedHashMap;
import java.util.Map;

public class FreqOfGivenElement {

	public static void main(String[] args) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
		int[] arr = {1, 2, 3, 4, 4, 5, 4, 6, 7, 4, 2, 1, 3, 2, 7};

     // add all elements of an array to map
		
		for(int data:arr) {
			if(map.containsKey(data)) {
				map.put(data, map.get(data)+1);
			}else {
				map.put(data, map.getOrDefault(data, 1));
			}
		}
     		
     		for(Map.Entry<Integer, Integer> entrySet : map.entrySet()) {
    			System.out.println(entrySet.getKey()+" "+ entrySet.getValue());
    		}
     		
     		
	}

}
