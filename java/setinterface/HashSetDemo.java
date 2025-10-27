package com.java.setinterface;

import java.util.HashSet;
import java.util.Set;

public class HashSetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Integer> numberHashSet1 = new HashSet<>();
		
		numberHashSet1.add(61);
		numberHashSet1.add(41);
		numberHashSet1.add(91);
		numberHashSet1.add(51);
		numberHashSet1.add(11);
		numberHashSet1.add(80);
		numberHashSet1.add(20);
		System.out.println(numberHashSet1);
		
		Set<Integer> numberHashSet2 = new HashSet<>();
		numberHashSet2.add(21);
		numberHashSet2.add(80);
		numberHashSet2.add(11);
		numberHashSet2.add(50);
		numberHashSet2.add(60);
		numberHashSet2.add(10);
		numberHashSet2.add(51);
		System.out.println(numberHashSet2);
		
		numberHashSet1.addAll(numberHashSet2); //Union
		System.out.println(numberHashSet1);
		
		numberHashSet2.retainAll(numberHashSet1);//Intersection
		System.out.println(numberHashSet2);
		
		numberHashSet2.removeAll(numberHashSet1);//
		System.out.println(numberHashSet2);
	}

}
