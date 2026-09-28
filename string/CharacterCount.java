package com.rays.string;

public class CharacterCount {

	public static void main(String[] args) {

		String name = "Shaad Khan";

		char ch = 'a';

		int count = 0;

		for (int i = 0; i < name.length(); i++) {

			if (name.charAt(i) == ch) {
				count++;
			}
		}
		System.out.println("  " + ch +  " = " +  count);

	}

}
