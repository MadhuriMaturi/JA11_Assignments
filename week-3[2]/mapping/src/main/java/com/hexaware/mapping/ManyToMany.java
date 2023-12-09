package com.hexaware.mapping;

import java.util.Date;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import com.hexaware.mapping.entities.Order;
import com.hexaware.mapping.entities.Product;

public class ManyToMany {
	public static void main(String args[])
	
	{
	SessionFactory sessionFactory = HibernateUtil.getSessionFactory();
	Session session = sessionFactory.openSession();
	Transaction tx = session.beginTransaction();
	
	Product product1=new Product();
	product1.setProductId(10);
	product1.setProductName("electornic");
	product1.setPrice(4000);
	
	Product product2=new Product();
	product2.setProductId(20);
	product2.setProductName("babycare");
	product2.setPrice(9000);
	
	Product product3=new Product();
	product3.setProductId(30);
	product3.setProductName("grocery");
	product3.setPrice(8000);
	
	
	Order order1=new Order();
	order1.setOrderid(501);
	order1.setPurchaseDate(new Date());
	order1.addproduct(product3);
	order1.addproduct(product2);
	
	Order order2=new Order();
	
	order2.setOrderid(502);
	order2.setPurchaseDate(new Date());
	order2.addproduct(product1);
	order2.addproduct(product2);
	order2.addproduct(product3);
	
	
	session.persist(order1);
	session.persist(order2);
	tx.commit();
	
	
	
	
	
	
	
	}
}
