package com.rays.exception;

public class TestAccount {

	public static void main(String[] args) throws InsufficientBalance {
		
		Account ac  = new Account();
		
		ac.setBalance(1000);
		ac.deposit(500);
		
		try {
			ac.withdrwal(200000);
			
		} catch (InsufficientBalance e) {

			System.out.println(e);
		} 
		ac.setBalance(100000);
		ac.withdrwal(50000);
//		System.out.println(ac.getBalance());
	}
}
