package in.problemset;

public class CompareStringCharSequence {

	public static void main(String[] args) {
		String str1 = "example.com";
		String str2 = "Example.com";
		String str3 = "example.com";
		
		System.out.println(str1.contentEquals(str2));
		System.out.println(str1.contentEquals(str3));

	}

}
