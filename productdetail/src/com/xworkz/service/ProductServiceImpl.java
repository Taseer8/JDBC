package com.xworkz.service;

import com.xworkz.entity.ProductEntity;
import com.xworkz.repo.ProductRepo;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class ProductServiceImpl implements  ProductService {
	protected ProductRepo repo;

	@Override
	public void saveAndValidate(ProductEntity entity) {
		if(entity!=null) {
			repo.save(entity);

		}

	}
	@Override
	public void readById() {
		ProductEntity read = repo.readById(1);
		System.out.println("reading the data :"+read);
	}

}
