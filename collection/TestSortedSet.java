 package com.rays.collection;

import java.util.HashSet;
import java.util.SortedSet;
import java.util.TreeSet;

public class TestSortedSet{
	
	public static void main(String[] args) {
		
		SortedSet s = new TreeSet();
		
		s.add(100);
		s.add(200);
		s.add(500);
		s.add(400);
		s.add(300);
		
		System.out.println(s.first());
		System.out.println(s.last());
		System.out.println(s.headSet(200));
		System.out.println(s.tailSet(300));
		System.out.println(s.subSet(300, 500));
	}
	
}