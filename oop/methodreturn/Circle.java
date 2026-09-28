 package com.rays.oop.methodreturn;

public class Circle extends Shape{
	
	public double radius;
	
	public static final double PI = 3.14;
	
	public Circle(double radius) {
		this.radius = radius;
	}

	public double area() {
		double cArea = PI * radius * radius;
		System.out.println("Area of circle " + cArea);
		return cArea;
	}
	
}
