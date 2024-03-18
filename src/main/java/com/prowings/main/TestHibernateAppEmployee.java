package com.prowings.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prowings.entity.Employee;

public class TestHibernateAppEmployee {
	
	public static void main(String[] args) {
		
		Employee emp = new Employee();
		
		emp.setId(5);
		emp.setRoll(105);
		emp.setName("BBB");
		emp.setAddress("USA");
		
		Configuration conf = new Configuration();
		
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory sf = conf.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction txn = session.beginTransaction();
		
//		session.save(emp);
		
//		Employee emp2 = session.get(Employee.class,5);
		
//		System.out.println(emp2);
		
//		session.evict(emp);
		
		
//		session.saveOrUpdate(emp);
	
//		session.persist(emp);
		
//		session.remove(emp);
		
//		session.delete(emp);
		
		
		
//		Employee emp1 = session.get(Employee.class,3);
		
		
//		Employee emp1 = session.load(Employee.class,1);
		
		txn.commit();
		
//		System.out.println("Employee from Database :"+ emp1);
		
		System.out.println("Employee Object Saved To Database !!!!");
		
		session.close();
		
		
	}

}
