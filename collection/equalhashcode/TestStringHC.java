package com.rays.collection.equalhashcode;

public class TestStringHC {

	public static void main(String[] args) {

		String s = "December";

		String s1 = "December";

		System.out.println(s.equals(s1));
		System.out.println(s.hashCode());
		System.out.println(s1.hashCode());

	}
}
