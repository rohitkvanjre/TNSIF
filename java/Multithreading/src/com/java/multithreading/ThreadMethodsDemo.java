package com.java.multithreading;

public class ThreadMethodsDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ChildThread t1 = new ChildThread(5,"First");
		ChildThread t2 = new ChildThread(10,"Second");
		
		System.out.println("Current Thread: "+ Thread.currentThread());
		t1.start();
		t2.start();
		
		System.out.println("Current Thread: "+ Thread.currentThread());
		System.out.println(Thread.currentThread().getId());
		Thread.currentThread().setName("Child Thread");
		//t1.currentThread().setPriority(7);
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		System.out.println("Current Thread: "+ Thread.currentThread());

		System.out.println(Thread.currentThread().getName());
		System.out.println(Thread.currentThread().getPriority() );
	
	
	
	
	}

}
