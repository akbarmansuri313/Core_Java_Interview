package com.rays.oop.methodoverloading;

public class User {

	// 1 parameter
	public void login(String username) {
		System.out.println(username);
	}

	// 2 parameters
	public void login(String username, String password) {
		System.out.println(username + " " + password);
	}

	// 3 parameters
	public void login(String username, String password, int otp) {
		System.out.println(username +" " + password + " " +  otp);
	}
}