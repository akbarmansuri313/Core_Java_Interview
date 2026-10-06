package com.rays.collection;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;

public class TestQueue {

	public static void main(String[] args) {

		Queue<Integer> q = new ArrayBlockingQueue<Integer>(3);

		q.add(300);
		q.offer(800);
		q.offer(200);
		q.offer(100);

//		q.add(300);
	                                                         	// FIFO
		System.out.println(q);
		System.out.println(q.peek());               // find krte hai...
		System.out.println(q.poll());               // bahar nikalte hai..

		System.out.println(q);
	}
}