package com.java.synchronization;

public interface Bank {
	int MINBAL = 5000; //static final
	void withdraw(int amt) throws InsufficientBalanceException;
}
