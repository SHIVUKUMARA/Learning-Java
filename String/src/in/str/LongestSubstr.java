package in.str;

public class LongestSubstr {

	public static void main(String[] args) {
       String[] str = {"apple", "app", "app2"};
       
       for(int i = 0; i < str.length; i++) {
    	   //System.out.println(str[i].length());
    	   for(int j = i+1; j < str.length; j++) {
    		   if(str[i].charAt(i) == str[j].charAt(j)) {
    			   System.out.println(str[i]);
    		   }
    	   }
       }
	}
}