//2.	Find Smallest Element in an Array 

package in.set3;

public class SmallestEleInArray {

	public static void main(String[] args) {
		int[] arr = {22, 11, 52, 34, 5, 72, 7, 27};
		
		int min = arr[0];
		
		for(int i = 0; i < arr.length; i++) {
			if(min > arr[i]) {
				min = arr[i];
			}
		}
        System.out.println(min);
	}

}
