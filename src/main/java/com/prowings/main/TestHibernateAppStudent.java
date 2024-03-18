package com.prowings.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;
import org.hibernate.service.ServiceRegistry;

import com.prowings.entity.Student;

public class TestHibernateAppStudent {

	public static void main(String[] args) {
		
		Student std = new Student();
		
		std.setRoll(40);
		std.setName("Naam");
		std.setAddress("Ayodhya");
		
		Configuration conf = new Configuration();
		
		conf.configure("hibernate.cfg.xml");
		
		
		SessionFactory sf = conf.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction txn = session.beginTransaction();
		

		session.save(std);
	
		txn.commit();
	
		System.out.println("Student Object saved to Database successfully !!!");
		
		session.close();
		
	
		
	
	}
}
