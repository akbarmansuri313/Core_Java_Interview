package com.rays.collection;

import java.util.PriorityQueue;
import java.util.Queue;

public class TestQueuePriority {

	public static void main(String[] args) {

		Queue q = new PriorityQueue();

		q.add(100);
		q.add(50);
		q.add(300);
		q.add(400);

		// LOWEST  WALE KO NIKALGE BAHR
		System.out.println(q.peek());
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.contains(100));
	}

}
