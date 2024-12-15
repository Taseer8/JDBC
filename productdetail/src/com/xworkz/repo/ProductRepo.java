package com.xworkz.repo;

import com.xworkz.entity.ProductEntity;

public interface ProductRepo {
	
	public void save(ProductEntity entity);
	public ProductEntity readById(int id);

}
