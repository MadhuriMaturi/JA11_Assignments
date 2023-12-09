package com.hexarware.springrestdemo.repository;

import java.util.HashSet;
import java.util.Set;

import org.springframework.stereotype.Repository;

import com.hexarware.springrestdemo.entity.Product;
@Repository
public class ProductRepositoryImp implements IProductRepository {
	
	Set<Product> productSet=new HashSet<Product>();

	@Override
	public Product addProduct(Product product) {
		// TODO Auto-generated method stub
	  productSet.add(product);
		return product ;
	}

	@Override
	public Product UpdateProduct(Product product) {
		 productSet.add(product);
			return product ;
	}

	@Override
	public Product getByProduct(int productId) {
	Product product1=null;	
	
 for(Product product : productSet)
 {
	 if (product.getProductid() == productId) {

			product1 = product;
 }
 }

		return product1;
	}

	@Override
	public void deleteProductById(int productId) {
		for (Product product : productSet) {

			if (product.getProductid() == productId) {

				productSet.remove(product);
				System.out.println("Product Removed for Pid: " + productId);

			}

		}		

	}

	@Override
	public Set<Product> getAllProducts() {
		
		return productSet;
	}

}
