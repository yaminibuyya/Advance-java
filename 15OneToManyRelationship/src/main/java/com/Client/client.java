package com.Client;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;

import com.Connection.Connection;
import com.Model.Customer;
import com.Model.Product;


                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               class client {
	public static void main(String[] args) {
		Session session =Connection.getSession();
		session.getTransaction().begin();                                                                                                                                                                                                                                                                                                         
		Product pr= new Product("Wasing Machine",5600000.00);
		Product pr1=new Product("Fossil",7000.00);
		
		List<Product> products=new ArrayList<Product>();
		products.add(pr1);
		products.add(pr);
	
	Customer sahasra=new Customer("sahasra", "yamini", 900.00, products);
		session.save(sahasra);
	session.save(pr);
		session.save(pr1);
		
		
		session.getTransaction().commit();
		Connection.CloseSession(session);	
		
		
		
		
	}

}
