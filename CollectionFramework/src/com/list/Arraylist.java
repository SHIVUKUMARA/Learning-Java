package com.list;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

//ArrayList:

public class Arraylist {

	public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        
        // add elements
        list.add(10);
        list.add(5);
        list.add(15);
        
        // traversal:
        System.out.println("Elements are : ");
        for(int i = 0; i < list.size(); i++) {
        	System.out.print(list.get(i)+" ");
        }
        
    System.out.println("\n"+list);
    
    for(Integer obj:list) {
     System.out.print(obj+" ");
    }
    
    System.out.println();
    
    Iterator<Integer> itr = list.iterator();
    while(itr.hasNext()) {
    	System.out.print(itr.next()+" ");
    }
    
    System.out.println();
    List<Integer> list2 = new ArrayList<>();
    for(int i = 100; i <= 105; i++) {
    	list2.add(i);
    }
    list.addAll(list2);
    System.out.println(list);
    
	
	
    // update:
    list.set(1,  500);
    System.out.println(list);
    
    // checking element
	boolean result = list.contains(100);
	System.out.println(result);
	
	// delete
	list.remove(0);
	System.out.println(list);}
	}