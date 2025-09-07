package com.list;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class Test2 {

	public static void main(String[] args) {
        Queue<Integer> queue = new PriorityQueue<>(Collections.reverseOrder());
        
        queue.add(7);
        queue.add(29);
        queue.add(3);
        queue.add(45);
        queue.add(27);
        
        System.out.println(queue.peek());
	}

}
