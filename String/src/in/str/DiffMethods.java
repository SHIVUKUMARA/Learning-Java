package in.str;

import java.util.Arrays;

public class DiffMethods {

	public static void main(String[] args) {
		String str = "Java";
		
		//length(): No. of characters in given string
		System.out.println("Length of string is: "+str.length());
		
		//indexOf(): Index Position
		System.out.println("Index of J is : "+str.indexOf("J"));
		
		//lastIndexOf(): last index position of a character
		System.out.println("Last index position of a character 'a' is : "+ str.lastIndexOf("a"));
		
		//charAt(): position of a character
		System.out.println("character at position of: "+str.charAt(1));
		
		//toUpperCase();
		System.out.println("Converted to upper case: "+str.toUpperCase());
		
		//toLowerCase():
		System.out.println("Converted to lower case: "+str.toLowerCase());
		
		//toCharArray():
		char[] ch = str.toCharArray();
		System.out.println("Converted to character array: "+Arrays.toString(ch));
		
		//substring():
		System.out.println("substring of str is: "+str.substring(0,2));
		System.out.println("substring of str is: "+str.substring(1));
		
		//equals: to check content
		String str2 = "Java";
		System.out.println(str.equals(str2));
		
		//==: checks location
		System.out.println(str == str2);
		
		//compareTo():
		char ch1 = 'A';
		int i = ch1;
		System.out.println(i);
		
		String str3 = "JAva";
		String str4 = "Java";
		System.out.println(str3.compareTo(str4));
		
		//split(): String[]--splits string object and returns string array
		String str5 = "I like Programming";
		String[] arr = str5.split(" ");
		System.out.println(Arrays.toString(arr));

	}

}
