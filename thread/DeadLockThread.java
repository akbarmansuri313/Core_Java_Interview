package com.rays.thread;

//Deadlock tab hota hai jab do threads ek-dusre ke
//lock ka wait karte rehte hain aur koi bhi aage nahi badh pata.

public class DeadLockThread {

	static Object lock1 = new Object();
	static Object lock2 = new Object();

	public static void main(String[] args) {

		Thread t1 = new Thread() {

			@Override
			public void run() {

				synchronized (lock1) {

					System.out.println("Thread 1: lock1 mil gaya");

					synchronized (lock2) {

						System.out.println("Thread 1: lock2 mil gaya");
					}
				}
			}
		};

		Thread t2 = new Thread() {

			@Override
			public void run() {

				synchronized (lock2) {

					System.out.println("Thread 2: lock2 mil gaya");

					synchronized (lock1) {

						System.out.println("Thread 2: lock1 mil gaya");
					}
				}
			}
		};

		t1.start();
		t2.start();
	}
}
