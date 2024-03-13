package com.Test;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import com.model.Fruit;

public class test {

	public static void main(String[] args) {
    Configuration config=new Configuration().configure("hibernate.cfg.xml");
    SessionFactory sf=config.buildSessionFactory();
    Session session=sf.openSession();
    session.getTransaction().begin();
    
    Fruit f=new Fruit("Banana","yellow",100);
    Fruit f1=new Fruit("apple","Red",200);
    session.save(f);
    session.save(f1);
    
    session.getTransaction().commit();
    session.close();
    
		
		
		
		
		
	}

}
