package com.rays.thread;

public class TestRunnable {

	public static void main(String[] args) {

		Thread t1 = new Thread(new ByRunnable("James"));
		Thread t2 = new Thread(new ByRunnable("Khan"));

		t1.run();
		t2.run();
	}

}
