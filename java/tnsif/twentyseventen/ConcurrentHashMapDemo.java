package com.java.tnsif.twentyseventen;

import java.util.concurrent.ConcurrentHashMap;

public class ConcurrentHashMapDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConcurrentHashMap<Integer,String> m = new ConcurrentHashMap<>();
		
		m.put(100, "Hello");
		m.put(101, "How are you?");
		m.put(102, "I am Fine");
		
		System.out.println(m);
		
		m.putIfAbsent(103, "Hi");
		System.out.println(m);
		
		m.replace(101, "Fine");
		System.out.println(m);
	}

}
