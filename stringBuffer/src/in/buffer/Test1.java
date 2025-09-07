package in.buffer;

public class Test1 {

	public static void main(String[] args) {
		
		//creating string buffer object
		StringBuffer sb = new StringBuffer();
		String str = "Hello";
		StringBuffer sb2 = new StringBuffer(str);
		
		//default capacity ==> 16 characters
		System.out.println("Default capacity is : "+sb.capacity());
		System.out.println(sb2.capacity());
        
		sb.append("abcdefghijklmnopqrst");
		System.out.println(sb.length());
		System.out.println(sb.capacity());
		
		System.out.println("---------------------");
		
		System.out.println(sb2);
		System.out.println(sb2.hashCode());
		sb2.append(" Java");
		System.out.println(sb2);
		System.out.println(sb2.hashCode());
	}

}
