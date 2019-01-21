package com.test.TestProject.service;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.test.TestProject.beans.ProductService;


@Service
public class ProductServiceImpl implements ProductServiceInterface{

	public ResponseEntity<?> getProducts() {
		
		RestTemplate restTemplate = new RestTemplate();
		ProductService productService = restTemplate.getForObject("https://jl-nonprod-syst.apigee.net/v1/categories/600001506/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma",ProductService.class);

		return ResponseEntity.ok().body(productService.toString());
	}
	

}
