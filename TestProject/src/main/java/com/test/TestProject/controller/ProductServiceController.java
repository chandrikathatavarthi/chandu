package com.test.TestProject.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.TestProject.facade.ProductServiceFacade;


@RestController
public class ProductServiceController {
	@Autowired
	ProductServiceFacade productService;
	   
		@RequestMapping("/Product")
	    public ResponseEntity<?> getProducts()
	    {
		   
		   
	        return ResponseEntity.ok().body(productService.getProducts());

	    }
	}
