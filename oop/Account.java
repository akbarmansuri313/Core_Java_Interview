package com.rays.oop;

public class Account {

	private double balance;

	public double getbalance() {
		return balance;
	}

	public void setbalance(double balance) {
		this.balance = balance;

	}

//	 deposit method
	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println("total balance after deposit:- " + balance);
	}

//	 withdrawal method
	public void withdrawal(double amount) {
		if (balance < amount) {
			System.out.println("Insufficient fund transfer ");

		} else {
			balance = balance - amount;

			System.out.println("Total balance after withdrawal " + balance);
		}

	}

}