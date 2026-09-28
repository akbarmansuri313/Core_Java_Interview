package com.rays.oop.methodreturn;

public class TestShape {
	
	public static void calArea(Shape[] s) {
		
		for(int i =0; i<s.length; i++) {
			System.out.println("Area " + s[i].area());
		}
	}	
	
	public static void main(String[] args) {
		
		Shape s[] = new Shape[2];
		
		s[0] = Shape.getShape(1);
		
		s[1] = Shape.getShape(2);
		
		
	
//		Method Argumnet polymorphism hai yeh
		calArea(s);
	}
}
