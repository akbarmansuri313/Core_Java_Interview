package com.rays.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestFL {

	public static void main(String[] args) {

		List<FLShorting> list = new ArrayList<FLShorting>();

		list.add(new FLShorting("Yusuf", "Khan"));
		list.add(new FLShorting("Shaad", "Khan"));
		list.add(new FLShorting("Amin", "Khan"));
		list.add(new FLShorting("Akbar", "Mansuri"));

		Collections.sort(list);

		for (FLShorting e : list) {
			System.out.println(e);
		}
		
//		System.out.println(list);
	}

}
