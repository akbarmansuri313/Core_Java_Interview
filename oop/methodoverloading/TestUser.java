package com.rays.oop.methodoverloading;

public class TestUser {

	public static void main(String[] args) {

		User u = new User();

		u.login("JAVA");

		u.login("JAVA", "12345");

		u.login("JAVAa", "12345", 4567);
		
	}
}