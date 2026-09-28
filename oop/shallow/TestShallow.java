package com.rays.oop.shallow;

public class TestShallow {


	public static void main(String[] args) throws CloneNotSupportedException {
		
		Shallow s1 = new Shallow();
		
		s1.balance = 10;
		
		s1.address = new Address();
		s1.address.city = "Indore";
		
		Shallow s2 = (Shallow) s1.clone();
		
		s2.balance= 200;
		s2.address.city = "Bhopal";
		
		System.out.println(s1.balance);
		System.out.println(s1.address.city);
		System.out.println(s2.balance);
		System.out.println(s2.address.city);
		
	}
	
	
}