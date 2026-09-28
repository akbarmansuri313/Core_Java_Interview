package com.rays.basic;

public class NoteCount {

	public static void main(String[] args) {

		int[] notes = { 1000, 500, 100, 50, 10, 1 };
		int count = 0;
		int money = 9999;

		for (int i = 0; i < notes.length; i++) {

			count = money / notes[i];
			
			if (count > 0) {
				money = money % notes[i];
				System.out.println(notes[i] + " = " + count);
				
			}

		}

	}
}
