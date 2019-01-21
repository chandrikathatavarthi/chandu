package com.test.TestProject.facade;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.test.TestProject.service.ProductServiceInterface;


@Service
public class ProductServiceFacadeImpl implements ProductServiceFacade {
	
	@Autowired
	ProductServiceInterface productService;

	public ResponseEntity<?> getProducts() {
		
		return productService.getProducts();
	}

}
