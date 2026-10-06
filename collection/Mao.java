package com.rays.collection;

import java.util.HashMap;
import java.util.Map;


public class Mao {

	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
		map.put(1, 10);
		map.put(2, 20);
		
		map.put(2, 20);
		map.put(null, null);
		
		map.put(3, 30);
		
		System.out.println(map);
		
		System.out.println(map.get(1));
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue(20));
		
		System.out.println(map.isEmpty());
		System.out.println(map.remove(2, 20));
		System.out.println();
		
		
		for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
			
			System.out.println("Key " + entry.getKey());
			System.out.println("Value " + entry.getValue());
			
		}
	}

	
}
