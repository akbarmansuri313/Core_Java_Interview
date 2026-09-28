package com.rays.oop.methodreturn;

public class Shape {
	
	public double area() {
		return 0;
	}

	public static Shape getShape(int i) {
		
		if (i == 1) {
			return new Rectangle(4, 4);
		}
		if (i == 2) {

			return new Circle(5);
		}
		return new Shape();
	}

}
