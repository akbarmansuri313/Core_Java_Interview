package com.rays.basic;

public class ArmStrongNumber {

	public static void main(String[] args) {

	
		int number = 153;
		int sum = 0;
		int r = 0;
		int num = number;

		while (num > 0) {

			r = num % 10;
			sum = sum + (r * r * r);
			num = num / 10;
		}

		if (number == sum) {

			System.out.println("It is arm Strong");
		}else {
			System.out.println("It is not arm strong");
		}
	}
}
