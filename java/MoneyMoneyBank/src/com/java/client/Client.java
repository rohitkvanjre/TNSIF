package com.java.client;

import com.java.application.MMBankFactory;
import com.java.application.MMCurrentAcc;
import com.java.application.MMSavingAcc;
import com.java.framework.BankFactory;
import com.java.framework.CurrentAcc;
import com.java.framework.SavingAcc;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		BankFactory bf = new MMBankFactory();
		
		System.out.println("Current account details: ");
		CurrentAcc ca = new MMCurrentAcc(12345, "Rohit", 10000.0f, 500.f);
		System.out.println(ca.toString());
		ca.withdraw(3000);
		System.out.println(ca.toString());
		
		System.out.println("--------------------------");
		
		System.out.println("Savings account details: ");
		SavingAcc sa = new MMSavingAcc(98765,"Manoj Aradhya",15000.f,true);
		System.out.println(sa.toString());
		sa.withdraw(200);
		System.out.println(sa.toString());
	}

}
