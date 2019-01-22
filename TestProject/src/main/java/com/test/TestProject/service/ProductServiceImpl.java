package com.test.TestProject.service;

import java.util.ArrayList;
import java.util.List;
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
		List<Products> products = new ArrayList<Products>();
		RestTemplate restTemplate = new RestTemplate();
		ProductService productService = restTemplate.getForObject("https://jl-nonprod-syst.apigee.net/v1/categories/600001506/products?key=2ALHCAAs6ikGRBoy6eTHA58RaG097Fma",ProductService.class);
		
		  List<Object> list = productService.getProducts();
		 
/*

		for(Object p:list){
			
			Product product=(Product)p;
			Products pr=new Products();
			pr.setProductId(product.getProductId());
			pr.setTitle(product.getTitle());
			products.add(pr);
			
		}
		
		*/
		
		return ResponseEntity.ok().body(list);
	}
	

}
