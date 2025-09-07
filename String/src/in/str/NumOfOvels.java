package in.str;

import java.util.Scanner;

public class NumOfOvels {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the string: ");
		String str = sc.nextLine();
		
		String ovels = "aeiouAEIOU";
		int count = 0;
		for(int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);
			if(ovels.indexOf(ch) != -1) {
				count++;
			}
		}
		System.out.println(count);
	}

}
