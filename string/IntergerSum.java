package com.rays.string;

public class IntergerSum {

	public static void main(String[] args) {

		String name = "akb1234ar";

		int sum = 0;

		for (int i = 0; i < name.length(); i++) {

			if (Character.isDigit(name.charAt(i))) {

				sum = sum + Character.getNumericValue(name.charAt(i));

			}
		}

		System.out.println(sum);

	}

}
