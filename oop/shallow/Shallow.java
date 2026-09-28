package com.rays.oop.shallow;

public class Shallow implements Cloneable {
	
	public int balance;
	public Address address;
	
	@Override
	protected Object clone() throws CloneNotSupportedException {
		 return super.clone();
	}


}