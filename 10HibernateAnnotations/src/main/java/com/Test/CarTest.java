 package com.Test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

import com.model.Car;


public class CarTest {

	public static void main(String[] args) throws ParseException {

		
		Configuration configuration=new Configuration().configure("hibernate.cfg.xml");
		SessionFactory sessionfactory=configuration.buildSessionFactory();
		Session session=sessionfactory.openSession();
		session.getTransaction().begin();
		
		String date = "1990/12/25";
		String date1 = "1991/08/28";
		String date2 = "1992/01/20";
		SimpleDateFormat dateFormat = new SimpleDateFormat("yyyy/MM/dd");
		Date d = dateFormat.parse(date);
		Date d1 = dateFormat.parse(date1);
		Date d2 = dateFormat.parse(date2);
		
		Car person = new Car("suzuki","white",d);
		Car person2 = new Car("Lamborgi","Black",d1);
		Car person3 = new Car("Ferori","White",d2);
		session.persist(person);
		session.persist(person2);
		session.persist(person3);
		session.getTransaction().commit();
		
		
		Car p = session.get(Car.class, 1);	
		System.out.println(p);

//		System.out.println("start HQL----------------------------");
//	    hibernate query language(HQL)
//		Query query = session.createQuery("from Car");
//		List<Car> c = query.list();
//		c.forEach(System.out::println);
//	System.out.println("END HQL----------------------------");
		
		
		System.out.println("start NativeSQl----------------------------");
		Query query2 = session.createNativeQuery("select*from Car");
		List<Object[]> prs = query2.list();
		for (Object[] objects : prs) {
			System.out.println(objects[0]);
			System.out.println(objects[1]);
			System.out.println(objects[2]);
			System.out.println(objects[3]);

		}
		System.out.println("END Native sql----------------------------");
		session.close();

		
		
		
		
		
		
		
		
	}	
	}


