package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class ReadWriteLineByLine {

	public static void main(String[] args) throws IOException {

		BufferedReader bReader = new BufferedReader(new FileReader("D:\\Hello.txt"));

		BufferedWriter bWriter = new BufferedWriter(new FileWriter("D:\\WriteFile.txt"));
		String line = bReader.readLine();

		while (line != null) {
			System.out.println(line);

			bWriter.write(line);
			bWriter.newLine();

			line = bReader.readLine();

		}

		bReader.close();
		bWriter.close();
	}
}
