package com.list;

import java.util.ArrayDeque;
import java.util.Deque;

public class Test3 {

	public static void main(String[] args) {
		Deque<Integer> deque = new ArrayDeque<>();
		
		// adding obj to rear end:
		deque.add(12);
		deque.add(14);
		deque.add(2);
		
		System.out.println(deque);
		
		// add object to front end:
		deque.addFirst(100);
        
		System.out.println(deque);
		
		deque.addLast(1000);
		System.out.println(deque);
		
		// retrive
		System.out.println(deque.peek());
		System.out.println(deque.peekFirst());
		System.out.println(deque.peekLast());
		
		// delete head element
		System.out.println(deque.poll());
		System.out.println(deque);
		
		System.out.println(deque.pollLast());
		System.out.println(deque.pollFirst());
		System.out.println(deque);
	}

}
