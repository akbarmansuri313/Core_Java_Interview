package com.rays.io.serializable;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class TestEmployee {

	public static void main(String[] args) throws FileNotFoundException, IOException, ClassNotFoundException {

		Employee e = new Employee(1, "James");

		ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream("D:\\io\\Employee.txt"));

		out.writeObject(e);

		out.close();

		System.out.println("ObjectSerializable Successfully");

		ObjectInputStream in = new ObjectInputStream(new FileInputStream("D://io//Employee.txt"));

		System.out.println(in.readObject());

		in.close();

	}
}
