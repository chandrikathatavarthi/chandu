package com.test.TestProject.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.test.TestProject.Application;
import com.test.TestProject.facade.ProductServiceFacade;


@RestController
public class ProductServiceController {
	 private static final Logger LOGGER = LoggerFactory.getLogger(Application.class);
	
	@Autowired
	ProductServiceFacade productService;
	   
		@RequestMapping("/Product")
	    public ResponseEntity<?> getProducts()
	    {
		   
			LOGGER.info("Started Test Project");
	        return ResponseEntity.ok().body(productService.getProducts());

	    }
	}
