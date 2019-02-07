package com;

import java.awt.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
import org.hibernate.query.Query;

public class QueryDemo 
{

	public static void main(String[] args) {
		{
			try
			{
					Configuration config=new Configuration();
					config.configure("hibernate.cfg.xml");
					
					SessionFactory sessionFactory=config.buildSessionFactory();
					Session session=sessionFactory.openSession();
					
					Student student=(Student)session.load(Student.class,1002);
					
					Query query=session.createQuery("from Student");
					List<Student> listStudents=query.list();
					
					for(Student Student:listStudents)
					
				{
					System.out.println(student.getStudentId()+"\t"+student.getStudentName()+"\t"+student.getFees());
				}
				//session.close();
		}
			catch(Exception e)
			{
				System.out.println("Exception Arised:"+e);
			}
		}
	}
}