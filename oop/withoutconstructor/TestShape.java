package com.rays.oop.withoutconstructor;

public class TestShape {
	
	public static void main(String[] args) {
		
		Shape s[] = new Shape[2];
		
		s[0] = new Circle();
		s[1] = new Rectangle();
		
		Circle c  = (Circle) s[0];
		
		c.setRadius(5);
		
		Rectangle r = (Rectangle) s[1];
		
		r.setLength(4);
		r.setWidth(4);
		
		for(int i = 0; i<s.length; i++) {
			s[i].area();
		}		
		System.out.println(r.area());
		System.out.println(c.area());
	}

}
