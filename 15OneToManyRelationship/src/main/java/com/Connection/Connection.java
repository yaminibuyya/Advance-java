package com.Connection;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Connection {
	private static SessionFactory sf;
	static {
		Configuration config=new Configuration().configure("hibernate.cfg.xml");
		sf=config.buildSessionFactory();
		System.out.println(sf);
	}
     public static Session getSession() {
		return sf.openSession();
 }
     public static void CloseSession(Session session) {
    	 if(session!=null)
    		 session.close();
     }
     public static void main(String[] args) {
    	 System.out.println(getSession());
     }

}
