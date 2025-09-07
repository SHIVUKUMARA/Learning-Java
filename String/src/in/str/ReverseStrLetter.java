package in.str;

import java.util.Arrays;

public class ReverseStrLetter {
	
	public static void reverse() {
		String original = "I Love Java Programming";
        char[] characters = original.toCharArray();
        String reversed = "";
        
        for (int i = characters.length - 1; i >= 0; i--) {
            reversed += characters[i];
        }
        
        System.out.println(reversed);
	}

	public static void main(String[] args) {
		String original = "I Love Java Programming";
        String reversed = new StringBuilder(original).reverse().toString();
        System.out.println(original);
        System.out.println(reversed);

        reverse();
        
        String[] arr = original.split(" ");
//        System.out.println(Arrays.toString(arr));
        
        for(int i = 0; i < arr.length; i++) {
        	String rev = "";
        	for(int j = arr[i].length()-1; j >= 0; j-- ) {
        		rev += arr[i].charAt(j);
        	}
        	System.out.print(rev+" ");
        }
	}

}
