package in.str;

public class str1 {

	public static void main(String[] args) {
		//Immutable class
		
		//creating string object
		String str = "Java";
		System.out.println(str);  //it will print content not hexadecimal code because
		                          //toString method is overwritten in string class
		System.out.println(str.hashCode());
	 
		int[] arr = {10, 20};
		System.out.println(arr);  // it will print hexadecimal code 
		
		str.concat("World");
	    System.out.println(str);  //output: Java Java because string is immutable
	    System.out.println(str.hashCode());
	    
	    str = str.concat(" Classes");  //reassignment : new string object is created
	    System.out.println(str);
	    System.out.println(str.hashCode());
	    
	    System.out.println(str.concat(" And Object"));  // new string object is get created

	}

}
