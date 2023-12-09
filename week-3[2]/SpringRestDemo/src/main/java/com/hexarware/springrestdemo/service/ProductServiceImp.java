package com.hexarware.springrestdemo.service;

import java.util.Set;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexarware.springrestdemo.entity.Product;
import com.hexarware.springrestdemo.repository.IProductRepository;
@Service
public class ProductServiceImp implements IProductService 
{
	@Autowired
    IProductRepository repo;

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
      return repo.addProduct(product);
	}

	@Override
	public Product UpdateProduct(Product product) {
		// TODO Auto-generated method stub
		return repo.UpdateProduct(product);
	}

	@Override
	public Product getByProduct(int productId) {
		// TODO Auto-generated method stub
		return  repo.getByProduct(productId);
	}

	@Override
	public void deleteProductById(int productId) {
		// TODO Auto-generated method stub

		repo.deleteProductById(productId);
	}

	@Override
	public Set<Product> getAllProducts() {
		// TODO Auto-generated method stub
		return  repo.getAllProducts();
	}
	}


