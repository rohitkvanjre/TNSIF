package com.java.tnsif.twentyseventen;

import java.util.LinkedHashMap;

public class LinkedHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedHashMap<String,Integer> lhmap = new LinkedHashMap();
		lhmap.put("Nithin",56000);
		lhmap.put("Pankaj",56000);
		lhmap.put("Harshita",56000);
		lhmap.put("Anisha",56000);
		lhmap.put(null,56000);
		System.out.println(lhmap);
		
		lhmap.put("Anisha",null);
		System.out.println(lhmap);
		
	}

}
