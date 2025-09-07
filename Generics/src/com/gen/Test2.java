package com.gen;

class GenericClass<T>{
	private T obj;
	GenericClass(T obj){
		this.obj = obj;
	}
	
	public void getObject() {
		System.out.println(this.obj);
	}
}

public class Test2 {

	public static void main(String[] args) {
        GenericClass<String> genericClass = new GenericClass<>("Java");
        GenericClass<Integer> genericClass2 = new GenericClass<>(new Integer(10));
        
        genericClass.getObject();
        genericClass2.getObject();
	}

}
