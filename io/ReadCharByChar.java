package com.rays.io;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadCharByChar {

	public static void main(String[] args) throws IOException {

		FileReader file = new FileReader("D:\\io\\Keyboard.txt");

		FileWriter wfile = new FileWriter("D:\\io\\Copy.txt");

		int ch = file.read();

		while (ch != -1) {

			System.out.println((char) ch);

			wfile.write(ch);

			ch = file.read();
		}

		wfile.close();
		file.close();

		System.out.println("File copied successfully.");
	}

}
