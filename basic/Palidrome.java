package com.rays.basic;

public class Palidrome {

	public static void main(String[] args) {

		int number = 121;

		int num = number;

		int sum = 0;

		int r = 0;

		while (num > 0) {

			r = num % 10;

			sum = sum * 10 + r;

			num = num / 10;
		}
		if (sum == number) {
			System.out.println("palindrome number");
		} else {
			System.out.println("no palindrone Number");
		}
	}
}
