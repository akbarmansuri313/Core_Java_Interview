package com.rays.oop.interfacevariable;

public interface FunctionInt {

	public static final int r = 5;
	
	public int sum(int a, int b);
	
	public static void staticMethod() {
		System.out.println("Static Method");
	}
	
	default void info() {
		System.out.println("Default method");
		
	}

}