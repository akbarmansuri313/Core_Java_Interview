package com.rays.oop.methodreturn;

public class Rectangle extends Shape {

	public double length;
	public double width;

	public Rectangle(double length, double width) {
		this.length = length;
		this.width = width;
	}

	public double area() {
		double rArea = length * width;
		System.out.println("Area of Rectangle " + rArea);

		return rArea;
	}

}
