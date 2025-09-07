package com.list;

import java.util.LinkedList;

// linked list

public class Linkedlist {
	
	public static void printLinkedList(LinkedList<Integer> list) {
		System.out.print("\nHead <=> ");
		for(Integer node:list) {
			System.out.print(node+" <=> ");
		}
		System.out.print("null");
	}

	public static void main(String[] args) {
        LinkedList<Integer> linkedlist = new LinkedList<>();
        
        //isEmpty()
        System.out.println(linkedlist.isEmpty());
        
        // add element at the begining
        linkedlist.addFirst(10);
        
        // add element at the given index position
        linkedlist.add(1, 20);
        
        //add element at the end of the linked list
        linkedlist.addLast(30);
        
        System.out.println(linkedlist);
        
        printLinkedList(linkedlist);
        
        linkedlist.add(2, 1000);
        printLinkedList(linkedlist);
        
        System.out.println("\n"+linkedlist.isEmpty());
        
        //access element
        System.out.println(linkedlist.get(2));
        System.out.println(linkedlist.getFirst());
        System.out.println(linkedlist.getLast());
        
        System.out.println("peek element is : "+linkedlist.peek());
        System.out.println(linkedlist.peekFirst());
        System.out.println(linkedlist.peekLast());
        
        //update
        linkedlist.set(2, 5000);
        printLinkedList(linkedlist);
        
        //delete
        int removeNode = linkedlist.poll();
        System.out.println("\n"+removeNode);
        printLinkedList(linkedlist);
        
        System.out.println("\nfirst element deleted: ");
        System.out.println(linkedlist.pollFirst());
        printLinkedList(linkedlist);
        System.out.println("\nsecond element deleted: ");
        System.out.println(linkedlist.pollLast());
        printLinkedList(linkedlist);
        
        linkedlist.remove(0);
        printLinkedList(linkedlist);
        
        System.out.println("\n\n"+linkedlist.isEmpty());
	}

}
