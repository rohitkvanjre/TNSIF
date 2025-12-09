package com.java.framework;

public abstract class SavingAcc extends BankAcc {
	
	private boolean isSalaried;
	private static final float MINBAL = 500.00f;
	
	public SavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		super(accNo, accNm, accBal);
		this.isSalaried = isSalaried;
	}
	
	
	@Override
	public void withdraw(float amt) {
		if (amt > 0 && (getAccBal()-amt) >= MINBAL) {
			setAccBal(getAccBal()-amt);
		}
		else {
			System.out.println("Cannot Withdraw as minimum balance must be maintained");
		}
	}

	@Override
	public String toString() {
		return "SavingAcc [isSalaried=" + isSalaried + ", getAccNo()=" + getAccNo() + ", getAccNm()=" + getAccNm()
				+ ", getAccBal()=" + getAccBal() + "]";
	}
	
	
}



/*
 * { if (accBal>=) {
 * System.out.println("Successfully withdrawn amount= "+amt); accBal -= amt; }
 * else { System.out.println("Insufficient Balance!"); }
 * 
 * }
 * 
 * 
 * { System.out.println("Successfully deposited amount= "+amt); accBal+=amt; }
 */