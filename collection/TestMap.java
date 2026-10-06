package com.rays.collection;

import java.util.HashMap;
import java.util.Map;

public class TestMap {

	public static void main(String[] args) {

		Map<Integer, Integer> map = new HashMap<Integer, Integer>();

		map.put(1, 10);
		map.put(2, 20);
		map.put(null, null);
		map.put(3, null);             // only 1 null de skte hai multple dene pr 1 hi lega

		// null values store karta hai
		// sorting maintain nahi hai

		System.out.println(map.get(1));

		System.out.println(map.containsKey(3));

		System.out.println(map.containsValue(20));

		System.out.println(map);

		// Map ko iterate karna
		for (Map.Entry<Integer, Integer> entry : map.entrySet()) {

			System.out.println("Key = " + entry.getKey());
			System.out.println("Value = " + entry.getValue());
		}

		// for (Integer key : map.keySet()) {
		// System.out.println(key);
		// }

		System.out.println(map);

		map.clear();

		System.out.println(map);
	}
}