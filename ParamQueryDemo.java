package com;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.mapping.List;
import org.hibernate.query.Query;

public class ParamQueryDemo {

	public static void main(String[] args) {
		{
			try
			{
				Configuration config=new Configuration();
				config.configure("hibernate.cfg.xml");
				
				SessionFactory sessionFactory=config.buildSessionFactory();
				Session session=sessionFactory.openSession();
								
				Query query=session.createQuery("from Student where studentName=:sname");
				
				query.setParameter("sname","Harish Kumar");
				
				List<Student> listStudents=query.list();
				
				for(Student Student:listStudents)
				
			{
				System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getFees());
			}
			session.close();
	}
		catch(Exception e)
		{
			System.out.println("Exception Arised:"+e);
		}
			}
		}
	}
