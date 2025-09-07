package com.setterinjection.collection.primitive;

import java.util.List;

public class Product {

	private int productId;
	private String productCategory;
	private List<String> products;
	
	public int getProductId() {
		return productId;
	}
	public void setProductId(int productId) {
		this.productId = productId;
	}
	public String getProductCategory() {
		return productCategory;
	}
	public void setProductCategory(String productCategory) {
		this.productCategory = productCategory;
	}
	public List<String> getProducts() {
		return products;
	}
	public void setProducts(List<String> products) {
		this.products = products;
	}
	@Override
	public String toString() {
		return "Product [productId=" + productId + ", productCategory=" + productCategory + ", products=" + products
				+ "]";
	}
}
