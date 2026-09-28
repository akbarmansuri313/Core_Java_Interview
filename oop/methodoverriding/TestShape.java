package com.rays.oop.methodoverriding;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Circle();

		s.area();
		
		Circle c = (Circle) s;

		c.setRadius(5);

		System.out.println(c.area());
	}

}
