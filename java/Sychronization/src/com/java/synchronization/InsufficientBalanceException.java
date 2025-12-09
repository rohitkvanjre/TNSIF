package com.java.synchronization;

public class InsufficientBalanceException extends Exception{
	public InsufficientBalanceException() {
		super("Insufficient Balance in your account");
	}
	public InsufficientBalanceException(String msg) {
		super(msg);
	}
}
