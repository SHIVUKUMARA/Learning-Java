package in.problemset;

public class CharAtIndex {

	public static void main(String[] args) {
		String a = "Hello World!";
		int ind = 1;
		System.out.println(a.charAt(ind));
		
		for(int i = 0; i < a.length(); i++) {
			if(i == ind) {
				System.out.println(a.charAt(ind));
			}
		}

	}

}
