package com.rays.collection;

import java.util.ArrayDeque;
import java.util.Deque;

public class TestDeque {

	public static void main(String[] args) {

		Deque q = new ArrayDeque();

		
		q.add(20);
		q.add(40);
		q.add(30);

		System.out.println(q);
		System.out.println(q.offerFirst(10));
		System.out.println(q);
		System.out.println(q.offerLast(50));
		System.out.println(q);
		System.out.println(q.pollFirst());
		System.out.println(q.pollLast());
		System.out.println(q);
		System.out.println(q.peekFirst());
		System.out.println(q.peekLast());
	}
}