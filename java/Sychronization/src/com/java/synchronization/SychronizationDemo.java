package com.java.synchronization;

public class SychronizationDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account acc = new Account(101, "Amit", 50000);
		System.out.println(acc);
		
		AccountThread thread[] = new AccountThread[5];
		for(int i = 0; i<5; i++) {
			new AccountThread(acc,1000*(i+1));
		}
		System.out.println("------------------");
		System.out.println(acc);
	}

}
