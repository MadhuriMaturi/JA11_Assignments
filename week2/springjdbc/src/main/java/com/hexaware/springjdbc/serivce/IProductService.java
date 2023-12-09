package com.hexaware.springjdbc.serivce;

import java.util.List;

import com.hexaware.springjdbc.model.Product;

public interface IProductService 
{
	public boolean createProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProduct(int pid);
    public Product getProductById(int pid);
    public List<Product> getAllProducts();
}
