package com.rays.io.serializable;

import java.io.Serializable;

public class Account implements Serializable {

	public String name;
	public int balance;

	public Account(String name, int balance) {
		this.name = name;
		this.balance = balance;

	}

	@Override
	public String toString() {
		return name + " " + balance;
	}

}
