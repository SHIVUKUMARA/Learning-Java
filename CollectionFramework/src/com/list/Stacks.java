package com.list;

import java.util.Stack;

public class Stacks {

	public static void main(String[] args) {
		Stack<Integer> stack = new Stack<>();
		// LIFO - Last In First Out
		
		//isEmpty()
		System.out.println("is Stack empty: "+stack.isEmpty());
		
		// push
		stack.push(10);
		stack.push(20);
		stack.push(30);
		System.out.println("Stack elements are : "+ stack);
		
		//isEmpty()
		System.out.println("is Stack empty: "+stack.isEmpty());
		
		// pop()
		System.out.println(stack.pop());
		
		//search()
		System.out.println("index of 20 is :"+ stack.search(20));
		
		//peek()
		System.out.println("Peek element is : "+stack.peek());
	}

}
