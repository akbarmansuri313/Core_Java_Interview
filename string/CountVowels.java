package com.rays.string;

public class CountVowels {

	public static void main(String[] args) {

		char[] arr = { 'a', 'e', 'i', 'o', 'u' };

		String name = "Akbar Mansuri";

		int count = 0;

		for (int i = 0; i < arr.length; i++) {

			for (int z = 0; z < name.length(); z++) {

				if (arr[i] == name.charAt(z)) {

					count++;
				}
			}
			if (count > 0) {
				System.out.println("Vowels " + arr[i] + " Count " + count);
			}
			count = 0;
		}
	}
}
