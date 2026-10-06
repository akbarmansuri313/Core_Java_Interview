package com.rays.collection.streamapi;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class TestContestent {
	
	public static void main(String[] args) {

		List<Contestent> list = new ArrayList<>();

		list.add(new Contestent("Akbar", "9755530652"));
		list.add(new Contestent("yusuf", "9876352162"));
		list.add(new Contestent("Shaad", "8726177620"));
		list.add(new Contestent("Monu", "8871907652"));

		list.stream().filter(e -> e.mobileNo.length() == 10)
				.collect(Collectors.collectingAndThen(Collectors.toList(), e -> {
					Collections.shuffle(e);
					return e.stream();
				})).limit(3).forEach(e -> {
					System.out.println(e.name + " " + e.mobileNo);
				});

	}

}
