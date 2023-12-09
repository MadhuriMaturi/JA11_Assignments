package com.hexaware.springapp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springapp.beans.Product;
import com.hexaware.springapp.dao.IProductDAO;

@Service
public class ProductServiceImp implements IProductService
{ 
	@Autowired
	IProductDAO dao;
	
	public Product getproduct() {
		//business logics and input validation
		//we call dao method
		return dao.getProduct();
	}

}
