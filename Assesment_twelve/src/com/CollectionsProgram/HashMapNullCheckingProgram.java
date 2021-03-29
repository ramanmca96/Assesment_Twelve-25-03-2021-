package com.CollectionsProgram;

import java.util.HashMap;
import java.util.Map.Entry;

public class HashMapNullCheckingProgram {
	public static void main(String[] args) {

		HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
		map.put(101, 10);
		map.put(11, 2);
		map.put(null, null);
		map.put(null, 21);
		map.put(14, null);
		map.put(30, 14);
		map.put(10, 22);

		for (Entry<Integer, Integer> m : map.entrySet()) {
			System.out.println("Key: " + m.getKey() + "Value: " + m.getValue());
		}

		System.out.println(map.containsValue(18));
		System.out.println(map.containsKey(710));

		System.out.println(map.get(123));
		System.out.println(map);

		map.remove(null);
		System.out.println("After remove an element: ");
		System.out.println(map);

		System.out.println("After added an element: ");
		map.putIfAbsent(6, 661);
		System.out.println(map);

	}
}

