package com.java.application;

import com.java.framework.BankFactory;
import com.java.framework.CurrentAcc;
import com.java.framework.SavingAcc;

public class MMBankFactory extends BankFactory{

	@Override
	public SavingAcc getNewSavingAcc(int accNo, String accNm, float accBal, boolean isSalaried) {
		SavingAcc sa = new MMSavingAcc(accNo, accNm, accBal, isSalaried);
		return sa;
	}

	@Override
	public CurrentAcc getNewCurrentAcc(int accNo, String accNm, float accBal, float creditLimit) {
		CurrentAcc ca = new MMCurrentAcc(accNo, accNm, accBal, creditLimit);
		return ca;
	}
		
}
