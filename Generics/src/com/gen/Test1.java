package com.gen;

import java.util.ArrayList;

public class Test1 {

	public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("books");
        list.add("pen");
        list.add("Paper");
//        list.add(new Integer(10));  //it will give class castExcption error
        
        for(int i = 0; i<list.size(); i++) {
        	System.out.println(list.get(i));
        }
	}

}
