//19.	Find maximum product sub-array in a given array

package in.set3;

public class MaxProductSubArray {

	static int maxSubarrayProduct(int arr[]) {
		int result = arr[0];
		int n = arr.length;

		for (int i = 0; i < n; i++) {
			int mul = arr[i];
			for (int j = i + 1; j < n; j++) {
				result = Math.max(result, mul);
				mul *= arr[j];
			}
			result = Math.max(result, mul);
		}
		return result;
	}

	public static void main(String[] args) {
		int arr[] = { 10, -20, -30, 0, 70, -80, -20 };
		System.out.println("Maximum Sub array product is: " + maxSubarrayProduct(arr));

	}

}
