package com.rays.oop.constructorcalling;

public class ConstructorCalling {

	public String fName;
	public String lName;

	public ConstructorCalling() {
		System.out.println("Default Constructor.....");
	}

	public ConstructorCalling(String fName) {

		this();

		this.fName = fName;
	

		System.out.println("First Name " + lName);

	}

	public ConstructorCalling(String fName, String lName) {

		this();

		this.lName = lName;
	

		System.out.println("Last Name "  + lName);

	}

	

}