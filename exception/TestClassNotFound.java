package com.rays.exception;

public class TestClassNotFound {

	public static void main(String[] args) {

		try {
			Class.forName("Exception Class");

		} catch (ClassNotFoundException e) {

			System.out.println(e);

		}
	}

}
