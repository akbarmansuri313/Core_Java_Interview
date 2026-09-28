package com.rays.oop.interfacee;

public class TestBussinesman {

	public static void main(String[] args) {
		
		Bussinessman b = new Bussinessman();
		
		b.donation();
		b.party();
		b.helpToOther();
		b.earnMoney();
		
		Richman r  = new Bussinessman();
		
		r.donation();
		r.earnMoney();
		r.party();
		
		SocialWorker s  = new Bussinessman();
		s.helpToOther();
	}
}
