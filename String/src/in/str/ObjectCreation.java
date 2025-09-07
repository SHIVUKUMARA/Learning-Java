package in.str;

public class ObjectCreation {
	
	
    public static void main(String args[]) {
    	
    	String str = "Java";
    	System.out.println(str);
    	System.out.println(str.hashCode());
    	
    	String str1 = new String("Java");
    	System.out.println(str1);
    	System.out.println(str1.hashCode());
    	//Both have same value and store in same location and only one object is created
    	
    }
}
