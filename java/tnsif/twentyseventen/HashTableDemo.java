package com.java.tnsif.twentyseventen;

import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Hashtable<String,String> ht = new Hashtable<>();
		
		ht.put("Nithin","56000");
		ht.put("Pankaj","56000");
		ht.put("Harshita","56000");
		ht.put("Anisha","56000");
		ht.put("Anisha","65");
		
		System.out.println(ht);
		
		Enumeration em = ht.elements();
		while(em.hasMoreElements()) {
			System.out.println(em.nextElement());
		}
		
	}

}
