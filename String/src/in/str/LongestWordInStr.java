package in.str;

import java.util.Scanner;

public class LongestWordInStr {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Words: ");
		String str = sc.nextLine();
		
		String[] words = str.split(" ");
		String longestword = "";
		
		for(String word:words) {
			if(word.length() > longestword.length()) {
				longestword = word;
			}
		}
        System.out.println(longestword);
	}

}
