package com.ciq.models;

import com.ciq.Container.CardContainer;

public class ShoppingMall {
	private BankCard bankcard;
	
	public ShoppingMall( BankCard bankcard) {
		this.bankcard=bankcard;
	}
	public void dotransaction(long amount) {
		bankcard.doPayment(amount);
	}
	
	public static void main(String[] args) {

//	    BankCard bankcard=new CreditCard();
//		ShoppingMall pvrmall=new ShoppingMall(bankcard);
//		pvrmall.dotransaction(30000);
//		
//		
//		
//		BankCard bankcard1=new DebitCard();
//		ShoppingMall  punjagutaMall=new ShoppingMall(bankcard1);
//		punjagutaMall.dotransaction(90000);
		
		CardContainer cd=new CardContainer();
		BankCard bankcard=(BankCard) cd.getContainer("credit");
		ShoppingMall pvrmall=new ShoppingMall(bankcard);
		pvrmall.dotransaction(78700);
		
		
	}

}
