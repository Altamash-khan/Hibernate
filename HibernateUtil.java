package com;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {
	public static void main(String[] args) {
		try
		{
			Configuration config=new  Configuration(); 
			config.configure("hibernate.cfg.xml");
			
			SessionFactory sessionFactory=config.buildSessionFactory();
			Session session= sessionFactory.openSession();
		
			Transaction tran=session.beginTransaction();
			com.Student student=new com.Student();
			student.setStudentId(1002);
			student.setStudentName("Suresh Kumar");
			student.setFees(9000);
			session.save(student);
			//session.commit();
			
			System.out.println("Student Record Saved");
			
			
		}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
		}
	}


