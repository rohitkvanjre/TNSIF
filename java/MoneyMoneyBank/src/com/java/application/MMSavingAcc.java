package com.java.application;

import com.java.framework.SavingAcc;

public class MMSavingAcc extends SavingAcc{
		
	public MMSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal, isSalaried);
	}
	
	@Override
	public void withdraw(float amt) {
		super.withdraw(amt);
		System.out.println("Successfully Withdrawn the amt "+amt+" and your Balance is " +getAccBal());
	}

	@Override
	public String toString() {
		return "MMSavingAcc [ Account Number=" + getAccNo() + ", Account Name=" + getAccNm() + ", Account Balance=" + getAccBal() + "]";
	}
	
}
