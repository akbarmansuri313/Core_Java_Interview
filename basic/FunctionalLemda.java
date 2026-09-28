package com.rays.basic;

public class FunctionalLemda {

	public static void main(String[] args) {
	
		FunctionalInt f = (a,b) ->{
			return a + b;
		};
		
		int a  = 15;
		int b = 25;
		
		System.out.println(f.Sum(a, b));
		
		f.show();
		FunctionalInt.display();
	}
	
	}
