package com.feign.demo.service;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.feign.demo.model.Product;

@Service
public class ProductServiceImpl implements ProductService {

	
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return showProductList();
	}


	public List<Product> findByCategory(String category) {
//		System.out.println("<<<" + category + ">>>");
		List<Product> list = showProductList().stream().filter((product) -> (product.getCategory().equals(category)))
				.collect(Collectors.toList());
//		System.out.println(list);
		return list;
	}
	
	private List<Product> showProductList() {

		return Arrays.asList(

				new Product(1, "iPhone 14", "Mobile", 74600),
				new Product(2, "Split phone", "Mobile", 84600),
				new Product(3, "Grand Pixels", "Mobile", 45600),
				new Product(4, "iNSPIRON", "Laptop", 99900),
				new Product(5, "Thinkpad", "Laptop", 64600),
				new Product(6, "K6 Note", "Mobile", 35600), new Product(7, "Bravo", "TV", 34600),
				new Product(8, "HD Smart Tv", "TV", 94600),
				new Product(9, "Ideapad", "Laptop", 45600)

		);

	}


	@Override
	public Product getProductById(long id) {
		// TODO Auto-generated method stub
		return new Product(9, "Ideapad", "Laptop", 45600);
	}





	@Override
	public List<Product> getProductsByCategory(String category) {
		// TODO Auto-generated method stub
		return findByCategory(category);
	}


	@Override
	public List<Product> getProducts() {
		// TODO Auto-generated method stub
		return findAll();
	}
	


}