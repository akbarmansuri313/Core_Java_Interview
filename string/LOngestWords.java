package com.rays.string;

public class LOngestWords {

	public static void main(String[] args) {

		String name = "Java is programming language";

		String [] words = name.split(" ");

		String longestWord = "";

		for (String word : words) {

			if (word.length() > longestWord.length()) {

				longestWord = word;

			}
		}
		System.out.print(longestWord);
	}

}
