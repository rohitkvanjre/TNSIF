package com.java.multithreading;

public class ChildThread extends Thread{
	private int n;
	private String name;
	public ChildThread(int n, String name) {
		super();
		this.n = n;
		this.name = name;
	}
	
	public void run() {
		for(int i = 0;i<=n; i++) {
			System.out.println(name+i);
		}
	}
}
