package com.ciq.models;

public class CreditCard  implements BankCard{

	@Override
	public void doPayment(long amount) {
		System.out.println("Paying Amount in Credit Card : "+amount);		
	}

	
}
