package com.hexaware.springjdbc.serivce;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springjdbc.dao.IProductDAO;
import com.hexaware.springjdbc.model.Product;
@Service
public class ProductServiceimp implements IProductService {
	@Autowired
	IProductDAO dao;

	public boolean createProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.createProduct(product);
	}

	public boolean updateProduct(Product product) {
		// TODO Auto-generated method stub
		return dao.updateProduct(product);
	}

	public boolean deleteProduct(int pid) {
		// TODO Auto-generated method stub
		return dao.deleteProduct(pid);
	}

	public Product getProductById(int pid) {
		// TODO Auto-generated method stub
		return dao.getProductById(pid);
	}

	public List<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return null;
	}

}
