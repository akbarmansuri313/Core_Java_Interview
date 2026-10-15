package com.rays.io;

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class ReadWriteBinaryData {

	public static void main(String[] args) throws Exception {

		FileInputStream in = new FileInputStream("D:\\io\\srk.jpg");

		FileOutputStream out = new FileOutputStream("D:\\io\\Srk1.jpg");

		int ch = in.read();

		while (ch != -1) {

			System.out.println((char) ch);

			out.write(ch);

			ch = in.read();
		}
		in.close();
		out.close();
	}

}
