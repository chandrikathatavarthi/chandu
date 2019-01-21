package com.test.TestProject.service;

import java.util.stream.Collectors;

import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.test.TestProject.beans.Product;
import com.test.TestProject.beans.ProductResponse;
import com.test.TestProject.beans.ProductService;
import com.test.TestProject.beans.Products;


@Service
public class ProductServiceImpl implements ProductServiceInterface{

	public ResponseEntity<?> getProducts() {
		
		RestTemplate restTemplate = new RestTemplate();
		ProductResponse pr=new ProductResponse();
		ProductService productService = restTemplate.getForObject("https://jl-nonprod-syst.apigee.net/v1/categories/600001506/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma",ProductService.class);
	
		/*productService.getProducts().stream().forEach(product->
		pr.setProducts(new Products[0]{new Products(product.getProductId(),product.getTitle())}));*/
		
		
		
		return ResponseEntity.ok().body(pr);
	}
	

}
