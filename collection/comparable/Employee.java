package com.rays.collection.comparable;

public class Employee implements Comparable<Employee> {

	private int id;
	private String name;
	private int salary;

	public Employee(int id, String name, int salary) {

		this.id = id;
		this.name = name;
		this.salary = salary;
	}

	@Override
	public int compareTo(Employee o) {

		if (this.name.equals(o.name)) {

			if (this.salary == o.salary) {
				return 0;
			} else if (this.salary < o.salary) {
				return -1;
			} else {
				return 1;
			}

		} else if (this.name.compareTo(o.name) < 0) {
			return -1;
		} else {
			return 1;
		}
	}

//	public int compareTo(Employee e1) {
//		if (this.salary == e1.salary) {
//			return 0;
//			
//		} else if  (this.salary < e1.salary){
//			
//		return -1;
//			
//		} else {
//			return 1;
//		}
//	}

	@Override
	public String toString() {
		return id + " " + name + " " + salary;
	}
}