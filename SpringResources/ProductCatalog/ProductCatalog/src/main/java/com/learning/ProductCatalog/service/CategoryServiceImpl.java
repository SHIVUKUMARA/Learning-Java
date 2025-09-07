package com.learning.ProductCatalog.service;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.learning.ProductCatalog.entities.Category;
import com.learning.ProductCatalog.exception.ResourceNotFoundException;
import com.learning.ProductCatalog.payload.CategoryDto;
import com.learning.ProductCatalog.repositories.CategoryRepository;

@Service
public class CategoryServiceImpl implements CategoryService {

	@Autowired
	private CategoryRepository categoryRepo;

	@Autowired
	private ModelMapper modelMapper;

	@Override
	public CategoryDto addCategory(CategoryDto categoryDto) {
		Category category = this.modelMapper.map(categoryDto, Category.class);
		Category savedCategory = this.categoryRepo.save(category);
		return this.modelMapper.map(savedCategory, CategoryDto.class);
	}

	@Override
	public CategoryDto getCategoryById(Integer categoryId) {
		Category category = this.categoryRepo.findById(categoryId)
				.orElseThrow(() -> new ResourceNotFoundException("Category", "categoryId", categoryId));
		return this.modelMapper.map(category, CategoryDto.class);
	}

	@Override
	public List<CategoryDto> getAll() {
		List<Category> list = this.categoryRepo.findAll();
		return list.stream().map(category->this.modelMapper.map(category, CategoryDto.class))
				.collect(Collectors.toList());
	}

	@Override
	public CategoryDto updateCategory(Integer categoryId, CategoryDto categoryDto) {
		Category category = this.categoryRepo.findById(categoryId)
		.orElseThrow(() -> new ResourceNotFoundException("Category", "categoryId", categoryId));
		category.setCategoryName(categoryDto.getCategoryName());
		category.setCategoryDescription(categoryDto.getCategoryDescription());
		
		Category updatedCategory = this.categoryRepo.save(category);
		return this.modelMapper.map(updatedCategory, CategoryDto.class);
	}

	@Override
	public void deleteCategory(Integer categoryId) {
		Category category = this.categoryRepo.findById(categoryId)
          .orElseThrow(() -> new ResourceNotFoundException("Category", "categoryId", categoryId));
		this.categoryRepo.delete(category);
	}

}
