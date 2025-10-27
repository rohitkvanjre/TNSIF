package com.java.queueinterface;

import java.util.ArrayDeque;
import java.util.Deque;
public class ArrayQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Deque<String> arrayDeque = new ArrayDeque<>();
		arrayDeque.add("A");
		arrayDeque.add("B");
		arrayDeque.add("C");
		System.out.println(arrayDeque);
		
		arrayDeque.offer("F");
		arrayDeque.offerFirst("D");
		arrayDeque.offerLast("Z");
		System.out.println(arrayDeque);
		
		arrayDeque.add(null);
	}

}
