package com.rays.string;

public class TestStringAlphabetCount {

	public static void main(String[] args) {

		String name = "vijay nath";
		
		int count = 0;

		for (char ch = 'a'; ch <= 'z'; ch++) {
			
			for (int i = 0; i < name.length(); i++) {
				
				if (name.charAt(i) == ch) {
					count++;
				}
			}
			if (count > 0) {

				System.out.println("count " + count + "Ch " + ch);

			}
			count = 0;
		}
	}

}
