package com.rays.basic;

@FunctionalInterface
public interface FunctionalInt{
	
	public int Sum(int a , int b);
	
	public default void show() {
		System.out.println("Default Method");
	}
	
	public static void display() {
		System.out.println("Static method");
	}
	
	
}
