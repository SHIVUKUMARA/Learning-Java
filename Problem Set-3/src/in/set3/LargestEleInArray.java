//1.	Find Largest element in an array

package in.set3;

public class LargestEleInArray {

	public static void main(String[] args) {
		int[] arr = {11, 15, 9, 18, 23, 51};
		
		int max = arr[0];
		for(int i = 0; i< arr.length; i++) {
			if(max < arr[i]) {
				max = arr[i];
			}
		}
        System.out.println(max);
	}

}
