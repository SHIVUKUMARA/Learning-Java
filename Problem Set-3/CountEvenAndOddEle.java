//17.	Counting the number of even and odd elements in an array

package in.set3;

public class CountEvenAndOddEle {

	public static void main(String[] args) {
		int[] arr = {4, 6, 9, 2, 5, 8, 7, 1, 3};
        
		int evencount = 0; 
		int oddcount = 0;
		
		for(int i = 0; i < arr.length; i++) {
			if(arr[i] % 2 == 0) {
				evencount += 1;
			}else {
				oddcount += 1;
			}
		}
		System.out.println(evencount);
		System.out.println(oddcount);
	}

}
