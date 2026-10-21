package com.rays.thread;

public class TestwithThread {

	public static void main(String[] args) {

		WithThread t1 = new WithThread("James");
		WithThread t2 = new WithThread("Khan");

		t1.start();
		t2.start();
	}
}
