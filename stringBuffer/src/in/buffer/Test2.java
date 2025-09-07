package in.buffer;

public class Test2 {

	public static void main(String[] args) {
		StringBuffer sb = new StringBuffer("Hello");
		System.out.println(sb);

		// insert at any given index
		sb.insert(1, "Java"); // 1-is a index position to add new value, java-is a value
		System.out.println(sb);

		// delete
		sb.delete(1, 5); //1-starting index and 5-is ending index but 5 is excluded
		System.out.println(sb);
		
		//append
		sb.append(" Shivu");
		System.out.println(sb);
		
		//repeat
		StringBuffer sb2 = new StringBuffer();
		System.out.println(sb2.repeat("Java", 3));
		
		//replace
		sb2.replace(0, 5, "Hello");  //0- starting index and 5- is ending index but it is excluded
		System.out.println(sb2);

		// reverse
		sb.reverse();
		System.out.println(sb);

	}

}
