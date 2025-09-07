package com.list;

import java.util.Iterator;
import java.util.Vector;
import java.util.concurrent.CopyOnWriteArrayList;

// vector class

public class Vectorclass {

	public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        
        // add
        for(int i = 0; i<= 10; i++) {
        	vector.add(i);
        }
        
        System.out.println(vector);
        
        //vector.add(index, value);
        vector.add(1, 100);
        System.out.println(vector);
        
        //Traversal 
        System.out.println("\nfail fast iterator");
        Iterator<Integer> itr = vector.iterator();
        while(itr.hasNext()) {
        	System.out.print(itr.next()+" ");
        	//vector.add(200);  -->>> fail fast iterator
        }
        
        //CopyOnWriteArrayList
        CopyOnWriteArrayList<Integer> list = new CopyOnWriteArrayList<>();
        for(int i = 1; i <= 5; i++) {
        	list.add(i);
        }
        
        System.out.println();
        Iterator<Integer> itrr = list.iterator();
        while(itrr.hasNext()) {
        	System.out.print(itrr.next()+" ");
        	list.add(100);   // fail safe iterator
        }
        
        System.out.println("\nOriginal list: "+ list);
        
        // accessing a single element
        System.out.println(vector.get(1));
        
        //update
        vector.set(1,  500);
        System.out.println(vector);
        
        // remove
        vector.remove(1);
        System.out.println(vector);
	}

}
