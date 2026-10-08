package com.rays.exception;

public class Account {

	public double balance;

	public double getBalance() {
		return balance;
	}

	public void setBalance(double balance) {
		this.balance = balance;
	}

	public void deposit(double amount) {
		balance = balance + amount;
		System.out.println(balance);
	}

	public void withdrwal(double amount) throws InsufficientBalance  {

		if (amount > balance) {

			throw new InsufficientBalance();
		} else {
			balance = balance - amount;

			System.out.println(balance);
		}

	}
}