package com.java.multithreading;

public class UsingRunnable implements Runnable {

	int high, low;
	String msg;
	
	
	public UsingRunnable(int high, int low, String msg) {
		super();
		this.high = high;
		this.low = low;
		this.msg = msg;
		Thread t1 = new Thread(this);
		t1.start();
	}


	@Override
	public void run() {
		// TODO Auto-generated method stub
		System.out.println("Runnable Demo");
	}
	
}
