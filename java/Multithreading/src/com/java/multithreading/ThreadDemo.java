package com.java.multithreading;
public class ThreadDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread t1 = new ChildThread(5,"First");
		ChildThread t2 = new ChildThread(10,"Second");
		
		t1.start();
		t2.start();
	}

}
