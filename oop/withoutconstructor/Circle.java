package com.rays.oop.withoutconstructor;

public class Circle extends Shape {

	public int radius;

	public static final double PI = 3.14;

	public int getRadius() {
		return radius;
	}

	public void setRadius(int radius) {
		this.radius = radius;
	}

	public double area() {

		double cArea = PI * radius * radius;

		System.out.println("Area of circle " + cArea);

		return cArea;
	}

}
