package com.model;

import org.hibernate.Session;

import com.connection.connection;

public class ClientTest {
	
	public static void main(String[] args) {
		Session session = connection.getSession();
		session.getTransaction().begin();
		LeaveTracker lTracker = new LeaveTracker(23, 6, 456);
		LeaveTracker lTracker1= new LeaveTracker(65, 32, 144);
		Employee employee = new Employee("anil", 22000, lTracker);
		Employee employee1= new Employee("sahasra", 56000, lTracker1);
		//session.persist(lTracker1);
		session.persist(employee);
		session.persist(employee1);
		session.getTransaction().commit();
	     connection.closeSession(session);
	}

}
