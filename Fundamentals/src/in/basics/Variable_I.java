package in.basics;

//Instance variable : declared outside the method
//Object is mandatory to access the instance variable
//every object maintains its own copy of instance variable
public class Variable_I {
    int data = 100;
	public static void main(String[] args) {
    //Creating an object
		Variable_I obj = new Variable_I();
		Variable_I obj2 = new Variable_I();
		
		//accessing instance variable : objName.varName
		System.out.println(obj.data);
		System.out.println("-----------------------------");
		System.out.println("Before Modifying Value");
		System.out.println(obj.data);
		System.out.println(obj2.data);

		obj.data = 200;
		
		System.out.println("-----------------------------");		
		System.out.println("After Modifying Value");
		System.out.println(obj.data);
		System.out.println(obj2.data);
	}

}
