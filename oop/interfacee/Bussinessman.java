package com.rays.oop.interfacee;

public class Bussinessman implements Richman, SocialWorker {
	
	public void party() {
		System.out.println("Business PArty");
	}
	
	public void earnMoney() {
		System.out.println("Earn Money");
	}
	
	public void donation() {
		System.out.println("Donation");
	}

	public void helpToOther() {
		System.out.println("Help People");
	}
}
