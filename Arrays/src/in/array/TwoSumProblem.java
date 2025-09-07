package in.array;
import java.util.LinkedHashMap;
import java.util.Map;

public class TwoSumProblem {
	
	public static void sum(int[] arr, int Target) {
		Map<Integer, Integer> map = new LinkedHashMap<>();
      // add all elements of an array to map
		
		for(int i = 0; i<arr.length; i++) {
			map.put(arr[i], i);
		}
		System.out.println("Elements inserted are : "+map);
		
		for(int i = 0; i < arr.length; i++) {
			int key = Target - arr[i];
			if(map.containsKey(key)) {
				if(i!=map.get(key)) {
					System.out.println("FirstElement : "+i+" SecondElement : "+map.get(key));
				}
			}
		}
	}
	
	

	public static void main(String[] args) {
		int[] arr = {1, 3, 7, 5, 4};
		int Target = 10;
		sum(arr,Target);
	}

}
