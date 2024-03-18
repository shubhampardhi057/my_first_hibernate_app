package com.prowings.main;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.prowings.entity.Car;

public class TestHibernateAppCar {
	
	public static void main(String[] args) {
		
		Car car1 = new Car();
		
		car1.setId(1);
		car1.setName("Creta");
		car1.setCompanyName("Hyundai");
		
		Car car2 = new Car();
		
		car2.setId(2);
		car2.setName("Brezza");
		car2.setCompanyName("Maruti");
		
		Configuration conf = new Configuration();
		
		conf.configure("hibernate.cfg.xml");
		
		SessionFactory sf = conf.buildSessionFactory();
		
		Session session = sf.openSession();
		
		Transaction txn = session.beginTransaction();
		
		
		Car c1 = session.get(Car.class,1);
		
		System.out.println("Car1 "+ c1);
		
		
		txn.commit();
		session.close();
		
//		Second Session
		
//		Session session2 = sf.openSession();
		
//		Transaction txn2 = session2.beginTransaction();
//		
//		Car c2 = session2.get(Car.class,2);
		
//		System.out.println(">>>>>>>>>>>> 2:1 >>>>>>>>>"+c2);

//		Car c21 = session2.get(Car.class, 2);
//		System.out.println(">>>>>>>>>>>> 2:2 >>>>>>>>>"+c21);
		
		
//		txn2.commit();
//		session2.close();
		
		
		
//		Car car1 = session.load(Car.class,6);
			
		
		
//		session.update(car);
		
		
//		session.flush();
		
//		session.clear();
		
//		session.save(car1);
//		session.save(car2);
//		
//		session.evict(car1);
//		
//		System.out.println("@@@@@ :"+session.get(Car.class,1));
//		
//		
//		System.out.println("$$$$$ :"+session.get(Car.class,2));
		
		
		
//		txn.commit();
		
//		session.close(); 
		
//		car.setName("Scorpio");
		
//		Session session2 = sf.openSession();
		
//		Car car1 = session2.get(Car.class, 4);
//		Transaction txn2 = session2.beginTransaction();

//		session2.update(car); //throws NoUniqObjectEx
//		session2.merge(car);
		
		
//		txn2.commit();
//		session2.close();
		
		
	}

}
