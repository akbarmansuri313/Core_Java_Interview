package com.rays.collection.comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class TestEmployeeComparble {

	public static void main(String[] args) {

		List<Employee> list = new ArrayList<>();
		
		list.add(new Employee(1, "Rohit", 150000));
		list.add(new Employee(4, "Rohit", 140000));
		list.add(new Employee(2, "Ausuf", 120000));
		list.add(new Employee(3, "Saaad", 110000));
		list.add(new Employee(5, "Sai", 140000));

		Collections.sort(list);
//		 Collections.shuffle(list);
		
		for(Employee e  : list) {
			System.out.println(e);
		}

		System.out.println(list);
	}
}
