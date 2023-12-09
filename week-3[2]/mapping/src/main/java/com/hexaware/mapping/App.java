package com.hexaware.mapping;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mapping.entities.Address;
import com.hexaware.mapping.entities.Student;


public class App 
{
    public static void main( String[] args )
    {
        SessionFactory sessionFactory= HibernateUtil.getSessionFactory();
        Session session=sessionFactory.openSession();
        Transaction tx=session.beginTransaction();
        Address address=new Address(52,"hyderabad","telangana");
        Student student=new Student(102,"madhuri",address);
                 session.persist(student);
        //Student student=new Student(103,"ashwin");
        //Address address=new Address(53,"banglore","ka",student);
        //session.persist(address);
                  tx.commit();
                  session.close();
        
        
        
    }
}
