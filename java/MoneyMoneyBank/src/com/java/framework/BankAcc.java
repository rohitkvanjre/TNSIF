package com.java.framework;

public abstract class BankAcc {
	private int accNo;
	private String accNm;
	private float accBal;
	
	public BankAcc(int accNo, String accNm, float accBal) {
		this.accNo = accNo;
		this.accNm = accNm;
		this.accBal = accBal;
	}
	
	public abstract void withdraw(float amt);
	public void deposite(float amt) {
		if (amt > 0) {
			this.accBal+=amt;
		}
		else {
			System.out.println("Deposit amount should be greatter than 0");
		}
	}

	@Override
	public String toString() {
		return "BankAcc [accNo=" + accNo + ", accNm=" + accNm + ", accBal=" + accBal + "]";
	}

	public int getAccNo() {
		return accNo;
	}

	public String getAccNm() {
		return accNm;
	}

	public void setAccNm(String accNm) {
		this.accNm = accNm;
	}

	public float getAccBal() {
		return accBal;
	}
	
	public void setAccBal(float accBal) {
		this.accBal = accBal;
	}
	
}
