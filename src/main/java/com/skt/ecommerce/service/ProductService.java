package com.skt.ecommerce.service;

import java.util.List;

import com.skt.ecommerce.entity.Product;

public interface ProductService {

	Product createProduct(Product product);
	
	Product updateProduct(Long id, Product product);
	
	void deleteProduct(Long id);
	
	Product getProductById(Long id);
	
	List<Product> getAllProducts();
	
	List<Product> searchProducts(String name, String category);
}
