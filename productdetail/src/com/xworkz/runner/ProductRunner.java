package com.xworkz.runner;

import com.xworkz.entity.ProductEntity;
import com.xworkz.repo.ProductRepo;
import com.xworkz.repo.ProductRepoImpl;
import com.xworkz.service.ProductService;
import com.xworkz.service.ProductServiceImpl;

public class ProductRunner {

	public static void main(String[] args) {
		
		ProductEntity entity = new ProductEntity();
		entity.setProductname("facewash");
		entity.setProductprice("400");
		entity.setDescription("face wash gannier");
		
		ProductRepo repo = new ProductRepoImpl();
		ProductService service =  new ProductServiceImpl(repo);
		service.saveAndValidate(entity);
		service.readById();
		

	}

}
