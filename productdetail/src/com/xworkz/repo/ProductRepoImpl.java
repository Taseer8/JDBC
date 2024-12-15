package com.xworkz.repo;

import javax.persistence.EntityManager;

import com.xworkz.entity.ProductEntity;
import com.xworkz.utill.ProductUtill;

public class ProductRepoImpl implements ProductRepo {
	ProductUtill utill  = new ProductUtill();

	@Override
	public void save(ProductEntity entity) {
		EntityManager manager = utill.getFactory();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();
		
		
	}

	@Override
	public ProductEntity readById(int id) {
		EntityManager manager = utill.getFactory();
		return 	manager.find(ProductEntity.class, id);

	}

}
