package com.learning.ProductCatalog.service;

import java.util.List;

import com.learning.ProductCatalog.payload.CategoryDto;

public interface CategoryService {

	CategoryDto addCategory(CategoryDto categoryDto);
	CategoryDto getCategoryById(Integer categoryId);
	List<CategoryDto> getAll();
	CategoryDto updateCategory(Integer categoryId, CategoryDto categoryDto);
	void deleteCategory(Integer categoryId);
}
