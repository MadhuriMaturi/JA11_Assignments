package com.hexaware.springapp.dao;

import org.springframework.stereotype.Repository;

import com.hexaware.springapp.beans.Product;

@Repository
public class ProductDAOImp implements IProductDAO 
{
	
	public Product getProduct()
	{
		//any DB connectivity logics like JDBC, Hibernate ,JPA etc..
	   	return new Product(101,"mobile",450000);//it is record coming from db in realtime
	}

}
