package com.rays.oop.methodoverloading;

public class TestSum {

	public static void main(String[] args) {

		Sum s = new Sum();

		System.out.println(s.sum(25, 15));
		System.out.println(s.sum(15, 15, 20));
		System.out.println(s.sum(12, 12, 18, 26));
	}

}
