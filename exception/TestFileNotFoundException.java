package com.rays.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class TestFileNotFoundException {

	public static void main(String[] args) {

		try {

			FileReader reader = new FileReader("User.text");

			int file;

			while ((file = reader.read()) != -1) {
				System.out.println(file);
			}
		} catch (FileNotFoundException e) {

			System.out.println(e);
		}catch (IOException e) {

			System.out.println(e);
		}
	}

}
