package com.test.TestProject;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.client.RestTemplate;

import com.test.TestProject.beans.ProductService;


public class Application{

	private static final Logger log = LoggerFactory.getLogger(Application.class);

	public static void main(String[] args) {
		RestTemplate restTemplate = new RestTemplate();
		ProductService productService = restTemplate.getForObject("https://jl-nonprod-syst.apigee.net/v1/categories/600001506/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma",ProductService.class);
		System.out.println(productService.toString());

		



	}

}

