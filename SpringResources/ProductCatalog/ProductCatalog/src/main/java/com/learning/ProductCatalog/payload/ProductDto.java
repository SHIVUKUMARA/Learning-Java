package com.learning.ProductCatalog.payload;

import com.learning.ProductCatalog.entities.Category;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class ProductDto {

	private Integer productId;
	private String productName;
	private String productPrice;
	private Category category;
}
