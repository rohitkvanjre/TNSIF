package com.java.queueinterface;

import java.util.Iterator;
import java.util.PriorityQueue;
import java.util.Queue;

public class PriorityQueueDemo {
	public static void main(String[] args)
	{
		Queue<Integer> pq = new PriorityQueue<>();
		pq.add(3);
		pq.add(10);
		pq.add(7);
		pq.add(2);
		System.out.println(pq);
		System.out.println(pq.peek());
		System.out.println(pq);
		Iterator<Integer> iterator = pq.iterator();
		while(iterator.hasNext()) {
			System.out.print(iterator.next()+" ");
		}
	}
}
