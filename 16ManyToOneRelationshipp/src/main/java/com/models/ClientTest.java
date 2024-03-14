 package com.models;

import org.hibernate.Criteria;
import org.hibernate.Session;
import org.hibernate.criterion.Criterion;
import org.hibernate.criterion.Restrictions;

import com.Connection.Connection;

public class ClientTest {
	public static void main(String[] args) {
		Session session=Connection.getSession();
		session.getTransaction().begin();
		Person person=new Person("yamini","buyya");
		Person person1=new Person("poojitha","mamidi");
		Address ad=new Address("khammam","Telanagana",person);
		Address ad1=new Address("manchiryala","AP",person1);
		Address ad3=new Address("chennai","TN",person);
		Address ad4=new Address("banglore","Karnataka",person);
		session.save(person);
		session.save(ad);
		session.save(person1);
		session.save(ad1);
		
		
		session.save(ad3);
		session.save(ad4);
		
	Address address=session.get(Address.class, 1l);
	System.out.println(address);//iterating one row
	
	//to get the particular row from address class
//	Criteria cr=session.createCriteria(Address.class);
//	Criterion cn=Restrictions.eq("city","banglore");
//	
//		cr.add(cn);
//		Address uniqueresult=(Address)cr.uniqueResult();
//		System.out.println(uniqueresult);
		
	//to get particular row from Person class
//	Criteria cr=session.createCriteria(Person.class);
//	Criterion cn=Restrictions.eq("pid",2l);
//	
//		cr.add(cn);
//		Person uniqueresult=(Person) cr.uniqueResult();
//		System.out.println(uniqueresult);
//		
//if we want get a row frm address table particularly with person_id		
	//IAM NOT GETTING VALUE
		Criteria cr1=session.createCriteria(Address.class);
		Criterion cn1=Restrictions.eq("person_id",2l);
		
			cr1.add(cn1);
			Address uniqueresult1=(Address) cr1.uniqueResult();
			System.out.println(uniqueresult1);
			
		
		session.getTransaction().commit();
		Connection.CloseSession(session);
		
		
		
		
	}

}
