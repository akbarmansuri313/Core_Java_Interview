package com.rays.basic;

public class TestFunctionalTest {

	public static void main(String[] args) {
		
		FunctionalInt f = new FunctionalInt() {
			
			public int Sum (int a , int b) {
				return a + b;
			}
		};
		
		int a = 15;
		int b = 35;
		System.out.println(f.Sum(a, b));
		f.show();
		FunctionalInt.display();
		
	}
}