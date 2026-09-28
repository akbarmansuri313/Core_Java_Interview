package com.rays.string;

public class Intergerchar {

	public static void main(String[] args) {

		String name = "1Ak2ba3r4";

		String n = name.replaceAll("[^0-9]", "");

		System.out.println(n);

	}

}
