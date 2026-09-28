package com.rays.basic;

import java.time.LocalDate;
import java.time.Period;

public class AgeCount {
	
	public static void main(String[] args) {
		
		LocalDate d  = LocalDate.now();
		
		LocalDate cd  = LocalDate.of(2001, 05, 18);
		
		Period pd  = Period.between(cd, d);

		System.out.println(pd.getYears());
		
		System.out.println(pd.getDays());
		
		System.out.println(pd.getMonths());
		
	}

}
