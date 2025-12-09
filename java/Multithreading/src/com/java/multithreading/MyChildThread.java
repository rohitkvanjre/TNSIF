package com.java.multithreading;

public class MyChildThread extends Thread{
	public void run() {
		System.out.println("Inside run() method thread is alive or not"+this.isAlive());
		int no = 0;
		while(no<4) {
			no++;
			System.out.println("Number is: "+ no);
			try {
				sleep(3000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
	}
}
