package com.java.framework;

public abstract class  NormalAcc extends ShopAcc{
	private final float deliveryCharges;
	
	public NormalAcc(int accNo, String accNm,float charges, float deliverycharges) {
		super(accNo, accNm, charges);
		this.deliveryCharges = deliverycharges;
		// TODO Auto-generated constructor stub
	}

	public void bookProduct(float charges) {
		System.out.println("Account Number: "+ this.getAccNo() + "," + "Account Name: "+ this.getAccNo() + "Charges: "+(this.getCharges() +deliveryCharges));
	}

	@Override
	public String toString() {
		return "NormalAcc [deliveryCharges=" + deliveryCharges + "]";
	}
	
}
