package com.java.multithreading;
class Eclipse extends Thread{
	public void run() {
		System.out.println("Eclipse THread");
	}
}
class PPT extends Thread{
	public void run() {
		System.out.println("PPT THread");
	}
}
public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Eclipse e = new Eclipse();
		e.start();
		PPT p = new PPT();
		p.start();
	}

}
