package in.array;

public class SumOfArray {
	
	public static int Array(int[] arr) {
		
		int sum = 0;
		
		for(int data : arr) {
			sum += data;
		}
		return sum;
	}
	
	public static int RecurssionArray(int[] arr, int index) {
		if(index >= arr.length) {
			return 0;
		}
		return arr[index] + RecurssionArray(arr, index+1);
	}
	
	

	public static void main(String[] args) {
		
	   int[] arr = {1, 2, 3, 4, 5};
       int result = Array(arr);
       System.out.println(result);
       
       
       int result1 = RecurssionArray(arr, 0);
       System.out.println(result1);
	}

}
