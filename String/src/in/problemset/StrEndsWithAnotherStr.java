package in.problemset;

public class StrEndsWithAnotherStr {

	public static void main(String[] args) {
		String str1 = "JAVA Exercises";
		String str2 = "Java Exercise";
		String str3 = "es";
		
		System.out.println(str1.endsWith(str3));
		System.out.println(str2.endsWith(str3));

	}

}
