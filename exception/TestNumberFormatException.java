package com.rays.exception;

public class TestNumberFormatException {

	public static void main(String[] args) {
		
		String s = "abc123";
		
		try {
			System.out.println(Integer.parseInt(s));
		} catch (NumberFormatException e) {

			System.out.println(e);
			
		}
		
	}
	
}
