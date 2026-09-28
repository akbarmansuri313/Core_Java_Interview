package com.rays.basic;

public class Increment {
	
	public static void main(String[] args) {
		
		int  i = 0;
		
		int a = i++ + i-- + ++i + ++i + i++;
		
		System.out.println(a);
	}

}
