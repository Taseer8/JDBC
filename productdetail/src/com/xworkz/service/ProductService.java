package com.xworkz.service;

import com.xworkz.entity.ProductEntity;

public interface ProductService {
	
	public void saveAndValidate(ProductEntity entity);
	public void readById();

}
