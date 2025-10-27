package com.java.tnsif.twentyseventen;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class hashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<String, Integer> bookMap = new HashMap<>();
		
		bookMap.put("Let us C", 320);
		bookMap.put("The Complete Reference C++", 450);
		bookMap.put("The Complete Reference Java 2", 465);
		bookMap.put("Python Programming", 599);
		bookMap.put("Application Development using SpringBoot", 600);
		
		System.out.println(bookMap);
		
		System.out.println("Traversing a Map: ");
		Iterator i = bookMap.entrySet().iterator();
		while(i.hasNext())
		{
			Map.Entry me = (Map.Entry)i.next();
			System.out.println(me);
		}
		HashMap<String,String> hm = new HashMap();
		hm.put("Let us C", "320");
		hm.put("The Complete Reference C++", "450");
		hm.put("The Complete Reference Java 2", "465");
		hm.put("Python Programming", "599");
		hm.put("Let us C", null);
		hm.put(null, null);
		System.out.println(hm);
		
	}

}
