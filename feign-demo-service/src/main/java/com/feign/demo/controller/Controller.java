package com.feign.demo.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.feign.demo.model.Product;
import com.feign.demo.service.ProductService;

@RestController

@RequestMapping("/product-service")

public class Controller {

	

	@Autowired

	ProductService product;

	

	@GetMapping("/products")

	public List<Product> findAll() throws Exception{

		
//		throw new Exception();
	return product.getProducts();

	}

	@GetMapping("/product-cat/{category}")

	public List<Product> findByCategory(@PathVariable("category") String category){

		return product.getProductsByCategory(category);

		

	}

	@GetMapping("/product/{id}")

	public Product findById(@PathVariable long id) {

		return product.getProductById(id);

		

	}



}