package com.list;

import java.util.PriorityQueue;
import java.util.Queue;

public class Queues {

	public static void main(String[] args) {
		Queue<Integer> queue = new PriorityQueue<>();
		
		queue.add(20);
		queue.add(30);
        queue.add(15);
        queue.add(5);
        queue.add(8);
        
        System.out.println(queue);
        
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
        System.out.println(queue.poll());
        System.out.println(queue.peek());
	}

}
