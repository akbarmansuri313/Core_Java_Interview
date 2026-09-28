package com.rays.oop.inheritance;

public class TestShape {

	public static void main(String[] args) {

		Shape s = new Rectangle();

		s.area();
		s.setColour("Red");
		s.setBorderWidth("Five");

		Rectangle r = (Rectangle) s;
		
		r.setLength(5);
		
		r.setWidth(5);

		r.area();
	
		System.out.println(s.getBorderWidth());
		System.out.println(s.getColour());
		

	}
}