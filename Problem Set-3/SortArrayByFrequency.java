//10.	Sorting elements of an array by frequency 

package in.set3;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class SortArrayByFrequency {

	public static void main(String[] args) {
		int[] arr = { 1, 3, 1, 6, 4, 2, 8, 1, 4, 7, 8, 9, 0, 2 };

		 // Count the frequency of element
		Map<Integer, Integer> frequencyMap = new HashMap<>();
		for (int num : arr) {
			frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
		}
		
		// Create a list from the array elements
		List<Integer> list = new ArrayList<>();
        for (int num : arr) {
            list.add(num);
        }
        
        list.sort((a, b) -> {
            int freqCompare = frequencyMap.get(b).compareTo(frequencyMap.get(a));
            if (freqCompare != 0) {
                return freqCompare;
            } else {
                return a.compareTo(b);
            }
        });
        
        for (int num : list) {
            System.out.print(num + " ");
        }

	}

}
