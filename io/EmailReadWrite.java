package com.rays.io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class EmailReadWrite {

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new FileReader("D:\\Hello.txt"));

		BufferedWriter bw = new BufferedWriter(new FileWriter("D:\\Email.txt"));

		String email = br.readLine();

		while (email != null) {
			if (email.matches("^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9]+(\\.[A-Za-z0-9]+)*(\\.[A-Za-z]{2,})$")) {
				System.out.println(email);

				bw.write(email);
				bw.newLine();
			}

			email = br.readLine();

		}
		br.close();
		bw.close();

		System.out.println("Email valid check successfully");
	}

}
