package com.feign.demo.service;

import java.util.List;

import com.feign.demo.model.Product;

public interface ProductService {
	public Product getProductById(long id);
	public List<Product> getProducts();
	public List<Product> getProductsByCategory(String category);
}
