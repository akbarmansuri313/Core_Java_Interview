package com.rays.oop;

public final class Immutable {
	
	private final String name;
	
	public Immutable(String name) {
		this.name = name;
		
		System.out.println(name);
	}

	public String getName() {
		return name;
	}
}
