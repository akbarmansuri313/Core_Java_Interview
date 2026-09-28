package com.rays.exception;

public class tryWithMultiCatch {

	public static void main(String[] args) {

		int a = 10;

		String name = null;
		
		int [] arr = {1,2,3,4,5};

		try {

			System.out.println(arr[6]);
			
			System.out.println(a / 0);

			System.out.println(name.length());

		} catch (ArithmeticException e) {

			System.out.println(e);

			System.exit(0);

		} catch (NullPointerException e) {

			System.out.println(e);

		} finally {
			System.out.println("Finally");
		}

	}

}
