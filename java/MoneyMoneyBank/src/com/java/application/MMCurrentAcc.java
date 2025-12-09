package com.java.application;

import com.java.framework.CurrentAcc;

public class MMCurrentAcc extends CurrentAcc{

	public MMCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal, creditLimit);
	}
	
	@Override
	public void withdraw(float amt) {
		super.withdraw(amt);
		System.out.println("Successfully Withdrawn the amt "+amt+" and your Balance is " +getAccBal());
	}

	@Override
	public String toString() {
		return "MMCurrentAcc [Account Number=" + getAccNo() + ", Account Name=" + getAccNm() + ", Account Balance=" + getAccBal() + "]";
	}
}
