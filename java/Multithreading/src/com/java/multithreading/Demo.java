package com.java.multithreading;
class Jeclipse implements Runnable{
	public void run() {
		System.out.println("Eclipse THread");
	}
}
class Ppt extends Thread{
	public void run() {
		System.out.println("PPT THread");
	}
}
public class Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Jeclipse e = new Jeclipse();
		Thread obj = new Thread(e);
		obj.start();
		
		
		Ppt p = new Ppt();
		Thread obj1 = new Thread(p);
		obj1.start();
	}

}
