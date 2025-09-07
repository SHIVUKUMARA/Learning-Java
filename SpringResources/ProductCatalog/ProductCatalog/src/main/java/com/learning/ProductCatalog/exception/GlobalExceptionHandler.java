package com.learning.ProductCatalog.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.learning.ProductCatalog.payload.ApiResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {

	@ExceptionHandler(ResourceNotFoundException.class)
	public ResponseEntity<ApiResponse> resourceNotFoundExceptionHandler(ResourceNotFoundException ex){
		String msg = ex.getMessage();
		boolean status = false;
		ApiResponse response = new ApiResponse(msg, status);
		return new ResponseEntity<ApiResponse>(response, HttpStatus.NOT_FOUND);
	}
}
