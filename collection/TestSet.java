package com.rays.collection;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class TestSet {
	public static void main(String[] args) {
		
		Set s = new HashSet();
		
		s.add(10);
		s.add(20);
		s.add(30);
		s.add(30);
		s.add(40);
		
		System.out.println(s);
		
		HashSet s1 = new HashSet();
		
		s1.add(10);
		s1.add(20);
		s1.add(30);
		s1.add(30);
		s1.add(40);
		
		Iterator it = s1.iterator();
		
		while(it.hasNext()) {
			System.out.println(it.next());
		}
		
	}
}