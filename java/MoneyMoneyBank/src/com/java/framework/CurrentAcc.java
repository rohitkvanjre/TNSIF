package com.java.framework;

public abstract class CurrentAcc extends BankAcc {
	private final float creditLimit;	

	public CurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		super(accNo, accNm, accBal);
		this.creditLimit = creditLimit;
	}
	
	@Override
	public void withdraw(float amt) {
		if(amt > 0 && amt <= getAccBal()+creditLimit) {
			setAccBal(getAccBal()-amt);
		}
		else {
			System.out.println("Transaction Failed: Credit Limit is exceeded. Credit Limit = " + creditLimit);
		}
	}

	@Override
	public String toString() {
		return "CurrentAcc [creditLimit=" + creditLimit + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + "]";
	}
	
	
}
