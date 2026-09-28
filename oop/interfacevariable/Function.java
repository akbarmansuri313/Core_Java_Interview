package com.rays.oop.interfacevariable;

public class Function implements FunctionInt{

	@Override
	public int sum(int a, int b) {
		return a +b;
	}

	public static void main(String[] args) {
		
		Function f  = new Function();
		
		System.out.println(f.sum(10, 20));
		
		FunctionInt.staticMethod();
		System.out.println(FunctionInt.r);
	}
	
}
