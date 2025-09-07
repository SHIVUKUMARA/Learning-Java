package com.learning.ProductCatalog.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.learning.ProductCatalog.payload.ProductDto;
import com.learning.ProductCatalog.service.ProductService;

@RestController
@RequestMapping("/api/product")
public class ProductController {

	@Autowired
	private ProductService productService;
	
	@PostMapping("/category/{categoryId}")
	public ResponseEntity<ProductDto> addProduct(@PathVariable Integer categoryId, @RequestBody ProductDto productDto){
		ProductDto product = this.productService.addProduct(categoryId, productDto);
		return new ResponseEntity<ProductDto>(product, HttpStatus.CREATED);
	}
	
	@GetMapping("/{productId}")
	public ResponseEntity<ProductDto> getProductById(@PathVariable Integer productId){
		ProductDto productById = this.productService.getProductById(productId);
		return new ResponseEntity<ProductDto>(productById, HttpStatus.FOUND);
	}
	
	@GetMapping("/")
	public ResponseEntity<List<ProductDto>> getAllProduct(){
		List<ProductDto> list = this.productService.getAll();
		return new ResponseEntity<List<ProductDto>>(list,HttpStatus.OK);
	}
	
	@PutMapping("/category/{categoryId}/product/{productId}")
	public ResponseEntity<ProductDto> updateProduct(@PathVariable Integer categoryId, @PathVariable Integer productId, @RequestBody ProductDto productDto){
		ProductDto updateProduct = this.productService.updateProduct(categoryId, productId, productDto);
		return new ResponseEntity<ProductDto>(updateProduct, HttpStatus.OK);
	}
}
