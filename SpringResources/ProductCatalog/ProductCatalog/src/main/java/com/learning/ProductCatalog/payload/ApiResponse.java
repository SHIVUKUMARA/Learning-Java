package com.learning.ProductCatalog.payload;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Setter
@Getter
public class ApiResponse {

	private String msg;
	private boolean status;
	public ApiResponse(String msg, boolean status) {
		super();
		this.msg = msg;
		this.status = status;
	}
	
}
