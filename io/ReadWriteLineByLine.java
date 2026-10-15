package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteLineByLine {

	public static void main(String[] args) throws IOException {

		BufferedReader reader = new BufferedReader(new FileReader("D:\\Hello.txt"));

		BufferedWriter writer = new BufferedWriter(new FileWriter("D:\\Email.txt"));
		String line = reader.readLine();

		while (line != null) {
			System.out.println(line);

			writer.write(line);
			writer.newLine();

			line = reader.readLine();

		}

		reader.close();
		writer.close();
	}
}
