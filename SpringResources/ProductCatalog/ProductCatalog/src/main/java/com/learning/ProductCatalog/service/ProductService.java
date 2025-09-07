package com.learning.ProductCatalog.service;

import java.util.List;

import com.learning.ProductCatalog.entities.Category;
import com.learning.ProductCatalog.payload.ProductDto;

public interface ProductService {

	ProductDto addProduct(Integer categoryId, ProductDto productDto);
	ProductDto getProductById(Integer productId);
	List<ProductDto> getAll();
	ProductDto updateProduct(Integer productId, ProductDto productDto);
	void deleteProduct(Integer productId);
	ProductDto addProduct(Integer categoryId, ProductDto productDto, Category category);
}