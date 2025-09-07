package com.learning.ProductCatalog.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.ProductCatalog.entities.Category;
import com.learning.ProductCatalog.entities.Product;
import com.learning.ProductCatalog.exception.ResourceNotFoundException;
import com.learning.ProductCatalog.payload.CategoryDto;
import com.learning.ProductCatalog.payload.ProductDto;
import com.learning.ProductCatalog.repositories.CategoryRepository;
import com.learning.ProductCatalog.repositories.ProductRepository;

@Service
public class ProductServiceImpl implements ProductService {

	@Autowired
	private ProductRepository productRepository;
	
	@Autowired
	private CategoryRepository categoryRepository;
	
	@Autowired
	private ModelMapper mapper;
	
	@Override
	public ProductDto addProduct(Integer categoryId, ProductDto productDto, Category category) {
		Product product = new Product();
		this.categoryRepository.findById(categoryId)
		.orElseThrow(()->new ResourceNotFoundException("Category", "categoryId", categoryId));
		product.setProductName(productDto.getProductName());
		product.setProductPrice(productDto.getProductPrice());
		product.setCategory(category);
		
		Product savedProduct = this.productRepository.save(product);
		return this.mapper.map(savedProduct, ProductDto.class);
	}

	@Override
	public ProductDto getProductById(Integer productId) {
		Product product = this.productRepository.findById(productId)
				.orElseThrow(()->new ResourceNotFoundException("Product", "productId", productId));
		return this.mapper.map(product, ProductDto.class);
	}

	@Override
	public List<ProductDto> getAll() {
		List<Product> list = this.productRepository.findAll();
	    return list.stream().map(product -> this.mapper.map(product, ProductDto.class))
	               .collect(Collectors.toList());
	}

	@Override
	public ProductDto updateProduct(Integer productId, ProductDto productDto) {
		Product product = this.productRepository.findById(productId)
				.orElseThrow(() -> new ResourceNotFoundException("Product", "productId", productId));
		Category category = this.categoryRepository.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "categoryId", categoryId));
		product.setProductName(productDto.getProductName());
		product.setProductPrice(productDto.getProductPrice());
		product.setCategory(category);
				
				Product updatedProduct = this.productRepository.save(product);
				return this.mapper.map(updatedProduct, ProductDto.class);
		return null;
	}

	@Override
	public void deleteProduct(Integer productId) {
		Product product = this.productRepository.findById(productId)
				.orElseThrow(()-> new ResourceNotFoundException, "Product", "productId", productId);    
	}
}
