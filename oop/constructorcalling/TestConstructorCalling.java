package com.rays.oop.constructorcalling;

public class TestConstructorCalling extends ConstructorCalling {

	public TestConstructorCalling(String fName, String lName) {
		super(fName, lName);

	}

	public static void main(String[] args) {

		TestConstructorCalling t = new TestConstructorCalling("Hritik", "Roshan");
		
	}

}