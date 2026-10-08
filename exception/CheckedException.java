package com.rays.exception;

public class CheckedException {

	public static void main(String[] args) {

		try {
			dad();
		} catch (Exception e) {

			System.out.println(e);
		}
	}

	public static void dad() throws Exception {
		System.out.println("Dad");
		mom();
		
	}

	public static void mom() throws Exception {
		System.out.println("Mom");
		son();
		
	}

	public static void son() throws Exception {

		System.out.println("son");
		throw new Exception();
	}
}
