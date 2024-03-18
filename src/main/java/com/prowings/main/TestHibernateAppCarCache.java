package com.prowings.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prowings.entity.Car;

public class TestHibernateAppCarCache {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.setId(1);
		car1.setName("Creta");
		car1.setCompanyName("Hyundai");
		
		
		Configuration conf = new Configuration();
		
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory sf = conf.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction txn = session.beginTransaction();
		
//		session.save(car1);
		
		System.out.println("1 st time getting from Database :"+session.get(Car.class,1));
		
		System.out.println("2 nd time getting from cache :"+session.get(Car.class,1));
		
		txn.commit();
		
		session.close();
		
//		Second Session
		
		Session session2 = sf.openSession();
		
		Transaction txn2 = session2.beginTransaction();
		
		Car c1 = session2.get(Car.class,1);
		System.out.println("2nd session 1st time entry from Database  : "+ c1);
		
		Car c2 = session2.get(Car.class,1);
		System.out.println("2nd session 2nd time entry from Database  : "+ c2);
		
		txn2.commit();
		
		session2.close();
		
		
		
	
		
	}

}
