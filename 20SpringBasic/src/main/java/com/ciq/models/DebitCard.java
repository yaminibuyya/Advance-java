package com.ciq.models;

public class DebitCard implements BankCard{

	
	@Override
	public void doPayment(long amount) {
		System.out.println("Paying Amount in Debit Card : "+amount);		
	}

}
