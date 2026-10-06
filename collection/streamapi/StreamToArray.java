package com.rays.collection.streamapi;

import java.util.stream.Stream;

public class StreamToArray {

	public static void main(String[] args) {

		Stream<String> str = Stream.of("xyz", "abc");

		String[] arr = str.toArray(String[]::new);

		for (String s : arr) {
			System.out.println(s);
		}
	}
}