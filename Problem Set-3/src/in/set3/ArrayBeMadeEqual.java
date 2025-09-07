//22.	Determine can all numbers of an array be made equal

package in.set3;

public class ArrayBeMadeEqual {
	
	public static boolean equal(int[] arr) {
		for(int i = 0; i < arr.length; i++) {
			while(arr[i] % 2 == 0) {
				arr[i] = arr[i] / 2;
			}
				
			while(arr[i] % 3 == 0) {
				arr[i] = arr[i] / 3;
			}
		}
		for(int i = 1; i < arr.length; i++) {
			if(arr[i] != arr[0]) {
				return false;
			}
		}
		return true;
	}

	public static void main(String[] args) {
		int arr[] = { 50, 100, 75 };
	    
        if (equal(arr))
            System.out.print("Yes");
        else
            System.out.print("No");

	}

}
