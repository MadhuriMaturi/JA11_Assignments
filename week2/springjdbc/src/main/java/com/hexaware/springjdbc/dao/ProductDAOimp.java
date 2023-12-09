package com.hexaware.springjdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.springjdbc.model.Product;
@Repository
public class ProductDAOimp implements IProductDAO 
{
   JdbcTemplate jdbcTemplate;
   
   
   @Autowired
   public ProductDAOimp(DataSource datasource)
   {
	   jdbcTemplate=new JdbcTemplate(datasource);
   }
 
   

	public boolean createProduct(Product product) {
		
		String insert="insert into product(pid,pname,price) values(?,?,?)";
		 int count =jdbcTemplate.update(insert,product.getPid(),product.getPname(),product.getPrice());
		
		return count >0;
	}

	public boolean updateProduct(Product product)
	{
		String updateQuery="update product set pname=?,price=?where pid=?";
		 int count=jdbcTemplate.update(updateQuery,product.getPname(),product.getPrice(),product.getPid());
		return count>0;
	}

	public boolean deleteProduct(int pid)
	{
		String deleteQuery="delete from product where pid=?";
		 int count=jdbcTemplate.update(deleteQuery,pid);
		return count>0;
	}

	public Product getProductById(int pid) {
		String selectById="select * from product where pid=?";
		 Product product=jdbcTemplate.queryForObject(selectById, new ProductMapper());
		return product;
	}

	public List<Product> getAllProducts() {
		String selectAll="select * from Products";
		List<Product> list=jdbcTemplate.query(selectAll,new ProductMapper());
		return list;
	}

}
