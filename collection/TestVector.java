package com.rays.collection;

import java.util.Enumeration;
import java.util.Vector;

public class TestVector {

	public static void main(String[] args) {
		Vector v = new Vector();

		v.add(100);

		v.add(200);

		v.add(300);
		v.addElement(400);

		Enumeration e = v.elements();

		v.addElement(500);

		while (e.hasMoreElements()) {
			System.out.println(e.nextElement());
		}

	}

}
