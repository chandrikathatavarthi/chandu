package com.test.TestProject;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.client.RestTemplate;

import com.test.TestProject.beans.ProductService;


	@SpringBootApplication 
	public class Application {
	   public static void main(String[] args)
	   {
	      SpringApplication.run(Application.class, args);
	   }
	}
	

