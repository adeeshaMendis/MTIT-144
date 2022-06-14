package com.assignment.MTIT144.productservice.productservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import com.assignment.MTIT144.productservice.controller.ProductController;

@SpringBootApplication
@ComponentScan(basePackageClasses = ProductController.class)
public class ProductServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(ProductServiceApplication.class, args);
	}

}
