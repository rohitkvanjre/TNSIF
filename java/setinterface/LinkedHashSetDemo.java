package com.java.setinterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {

	public static void main(String[] args) {
		LinkedHashSet<Integer> lhset = new LinkedHashSet<>();
		lhset.add(10);
		lhset.add(40);
		lhset.add(20);
		lhset.add(30);
		lhset.add(50);
		System.out.println(lhset);
		
		//Collections.sort(lhset);
		
		ArrayList<Integer> array = new ArrayList<>(lhset);
		
		Collections.sort(array);
		System.out.println(array);
	}

}
