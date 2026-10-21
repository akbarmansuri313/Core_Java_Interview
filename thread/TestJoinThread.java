package com.rays.thread;

public class TestJoinThread {

	public static void main(String[] args) {

		JoinThread t1 = new JoinThread("James");

		JoinThread t2 = new JoinThread("Khan");

		t1.start();

		try {
			t1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		t2.start();
	}
}