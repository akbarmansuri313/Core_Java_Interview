package com.rays.exception;

public class StringIndexOutOfBound {
	
	public static void main(String[] args) {
		
		String n = "abc";
		try {
			System.out.println(n.charAt(4));
		} catch (StringIndexOutOfBoundsException e) {

			System.out.println(e);
		}
	}

}
