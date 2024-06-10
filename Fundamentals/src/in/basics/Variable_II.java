package in.basics;

public class Variable_II {
    static int data = 100;
	public static void main(String[] args) {
     
	//Accessing Using className:
		System.out.println(Variable_II.data);
		
	//Accessing Using object:
		Variable_II obj = new Variable_II();
		Variable_II obj2 = new Variable_II();
		
		System.out.println("---------------------------");
		System.out.println("Before Modifying value");
		System.out.println(obj.data);
		System.out.println(obj2.data);
		
		obj.data = 500;
		
		System.out.println("---------------------------");
		System.out.println("Before Modifying value");
		System.out.println(obj.data);
		System.out.println(obj2.data);
	}

}
