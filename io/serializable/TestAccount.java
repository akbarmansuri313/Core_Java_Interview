package com.rays.io.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestAccount {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {
		
		Account a = new Account("James", 5000);

		System.out.println("Before Serilization = " + a);

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D://io//account.txt"));

		out.writeObject(a);

		System.out.println(out);

		out.close();

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D:\\io\\account.txt"));

		System.out.println(in.readObject());

		in.close();

	}
}
