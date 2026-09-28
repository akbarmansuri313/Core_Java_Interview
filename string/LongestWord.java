package com.rays.string;

public class LongestWord {

	public static void main(String [] args) {
		
		String paragrapah  = "Java is high profile programming";
		
		String[] words  = paragrapah.split(" ");
		
		String  longword = "";
		
		for(String word : words) {
			
			if (word.length() > longword.length()) {
				 
				longword = word;
				
			}
		}
		
		System.out.println("long word = " + longword);
		
	}
}
