package com.rays.basic;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class CalendarDate {

	public static void main(String[] args) throws Exception {

		SimpleDateFormat sdf  = new SimpleDateFormat("dd-MM-yyyy");
		
		Date d  = sdf.parse("01-10-2026");
		
		Calendar c = Calendar.getInstance();
		
		c.setTime(d);
		
		for(int i = 1; i<=12; i++) {
			
			c.add(Calendar.DATE, 30);
			
			System.out.println(sdf.format(c.getTime()));
		}
	}
}
