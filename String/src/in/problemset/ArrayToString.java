package in.problemset;

public class ArrayToString {

	public static void main(String[] args) {
		char[] arr = {'1', '2', '3', '4', '5'};
		
		String str = String.copyValueOf(arr, 0, 3);
		System.out.println(str);
		
		String str1 = String.copyValueOf(arr);
		System.out.println(str1);

	}

}
