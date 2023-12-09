package com.hexarware.restapi.restcontroller;

import static org.junit.jupiter.api.Assertions.assertNotNull;

import java.util.List;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.web.client.RestTemplate;

import com.hexarware.restapi.entity.Product;

@SpringBootTest
class ProductRestControllerTest2 {
	@Autowired
	RestTemplate restTemplate;
	Logger logger = LoggerFactory.getLogger(ProductRestController.class);

	@Test
	void testAddProduct() 
	{
		/*
		 * ProductDTO productDTO = new ProductDTO(); productDTO.setPname("Car");
		 * productDTO.setPrice(99000);
		 * 
		 * Product product =
		 * restTemplate.postForObject("http://localhost:8181/api/products/add",
		 * productDTO, Product.class);
		 * 
		 * logger.info("Product Added: " + product);
		 * 
		 * assertNotNull(product);
		 */

		
	}

	@Test
	void testGetById() {
		
	}

	
	  @Test void testGetAllProducts() {
		  List<Product>list2=restTemplate.getForObject("http://localhost:8181/api/products/getall",List.class); 
	  List<Product>list=restTemplate.getForObject("http://localhost:8181/api/products/getall", List.class);
	  logger.info("list of products " +list2); 
	  assertNotNull(list2); 
	  }
	 
}
