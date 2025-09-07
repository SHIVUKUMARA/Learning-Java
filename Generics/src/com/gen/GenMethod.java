package com.gen;

import java.util.Arrays;
import java.util.List;

class GenericMethod{
	public <T> void print(List<T> obj) {
		for(int i = 0; i<obj.size(); i++) {
			System.out.println(obj.get(i)+ " ");
		}
		System.out.println("------------------");
	}
}

public class GenMethod {

	public static void main(String[] args) {
        List<Integer> intList = Arrays.asList(1,2,3,4,5);
        List<Double> doubleList = Arrays.asList(1.2, 3.4, 5.6, 7.8, 9.0);
        List<Float> floatList = Arrays.asList(9.8f, 7.6f, 5.4f,3.2f);
        
        GenericMethod obj = new GenericMethod();
        obj.print(intList);
        obj.print(doubleList);
        obj.print(doubleList);
	}

}
