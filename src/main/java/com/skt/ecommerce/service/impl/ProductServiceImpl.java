package com.skt.ecommerce.service.impl;

import java.util.List;

import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import com.skt.ecommerce.entity.Product;
import com.skt.ecommerce.repository.ProductRepository;
import com.skt.ecommerce.service.ProductService;

@Service
public class ProductServiceImpl implements ProductService{

	private final ProductRepository productRepository;
	
	public ProductServiceImpl(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }
	@Override
	public Product createProduct(Product product) {
		return productRepository.save(product);
	}

	@Override
	public Product updateProduct(Long id, Product product) {
		Product existing = productRepository.findById(id)
				.orElseThrow(() -> new RuntimeException("Product not found with id: " + id));
		existing.setName(product.getName());
		existing.setDescription(product.getDescription());
	    existing.setPrice(product.getPrice());
	    existing.setStock(product.getStock());
	    existing.setCategory(product.getCategory());
	    existing.setImageUrl(product.getImageUrl());
	    
	    return productRepository.save(existing);
	}

	@Override
	public void deleteProduct(Long id) {

		if(!productRepository.existsById(id)) {
			throw new RuntimeException("product not found");
		}
		productRepository.deleteById(id);
	}

	@Override
	public Product getProductById(Long id) {
		return productRepository.findById(id)
				.orElseThrow(()-> new RuntimeException("Product not found with id: " + id));
	}

	@Override
	public List<Product> getAllProducts() {
		return productRepository.findAll();
	}

	@Override
	public List<Product> searchProducts(String name, String category) {
		if(StringUtils.hasText(name)) {
			return productRepository.findBynameContainingIgnoreCase(name);
		}else if(StringUtils.hasText(category)) {
			return productRepository.findByCategory(category);
		}else {
			return productRepository.findAll();
		}
	}

}
