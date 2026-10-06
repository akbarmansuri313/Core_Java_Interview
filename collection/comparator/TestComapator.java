package com.rays.collection.comparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class TestComapator {

	public static void main(String[] args) {

		List list = new ArrayList();

		list.add(new Employee(1, "Rishabh", 5000));
		list.add(new Employee(3, "Rishabh", 3300));
		list.add(new Employee(2, "Ajay", 4000));
		list.add(new Employee(4, "Aditya", 5000));

		EmployeeSortIDNameSalary empINS = new EmployeeSortIDNameSalary();

		Collections.sort(list, empINS);

		for (Object o : list) {
			System.out.println(o);
		}

//		EmployeeSortByName byName = new EmployeeSortByName();

//		Collections.sort(list, byName);

//		Iterator it = list.iterator();
//
//		while (it.hasNext()) {
//			System.out.println(it.next());
//		}
//		for (Object o : list) {
//			System.out.println("byName: " + o);
//			
//		}
//		

//		EmployeeSortByIdName IdName = new EmployeeSortByIdName();
//		
//		Collections.sort(list, IdName);
//		
//		Iterator it = list.iterator();
//		
//		while(it.hasNext()) {
//			System.out.println(it.next());
//		}

//		System.out.println(list);

	}
}
