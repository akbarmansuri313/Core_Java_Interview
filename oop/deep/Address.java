package com.rays.oop.deep;

public class Address implements Cloneable {

	public String city;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}
}