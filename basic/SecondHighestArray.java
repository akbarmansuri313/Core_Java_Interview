package com.rays.basic;

public class SecondHighestArray {

	public static void main(String[] args) {

		int num[] = { 31, 52, 62, 65, 98 };

		int firstHighest = 0;

		int secondHighest = 0;

		for (int i = 0; i < num.length; i++) {
			
			if (firstHighest < num[i]) {
				
				secondHighest = firstHighest;
				
				firstHighest = num[i];
			}
			if (secondHighest > num[i] && firstHighest < num[i]) {

				secondHighest = num[i];

			}
		}
		System.out.println(secondHighest);
	}
}
