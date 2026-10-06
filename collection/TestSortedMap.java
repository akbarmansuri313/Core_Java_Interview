 package com.rays.collection;

import java.util.SortedMap;
import java.util.TreeMap;

public class TestSortedMap {

	public static void main(String[] args) {

		SortedMap<Integer, String> m = new TreeMap<Integer, String>(); 

		m.put(2, "one");
		m.put(1, "two");
		m.put(3, "three");
		m.put(4, "four");
		m.put(5, null);              // multiple value de skte hai 
									// multiple key nahii
									 // do key same doge bd wali lega 
		m.put(6, null);
		m.put(6, "abc");
		

		System.out.println(m.lastKey());
		System.out.println(m.firstKey());
		System.out.println(m.headMap(4));
		System.out.println(m.tailMap(2));
		System.out.println(m.subMap(2, 4));
		System.out.println(m.entrySet());

//		System.out.println(m);
	}
}