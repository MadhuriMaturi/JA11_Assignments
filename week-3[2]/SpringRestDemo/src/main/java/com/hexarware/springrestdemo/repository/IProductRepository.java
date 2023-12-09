package com.hexarware.springrestdemo.repository;

import java.util.Set;

import com.hexarware.springrestdemo.entity.Product;

public interface IProductRepository 
{
	public Product addProduct(Product product);
	public Product UpdateProduct(Product product);
	public Product getByProduct(int productId);
	public void deleteProductById(int productId);
	public Set<Product> getAllProducts();
	

}
