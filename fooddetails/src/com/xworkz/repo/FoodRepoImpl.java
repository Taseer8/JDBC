package com.xworkz.repo;

import javax.persistence.EntityManager;

import com.xworkz.entity.FoodEntity;
import com.xworkz.utill.FoodUtill;

public class FoodRepoImpl implements FoodRepo {
	FoodUtill utill = new FoodUtill();

	@Override
	public void save(FoodEntity entity) {
		EntityManager manager =	utill.getManager();
		manager.getTransaction().begin();
		manager.persist(entity);
		manager.getTransaction().commit();
		manager.close();


	}

	@Override
	public FoodEntity readById(int id) {
		EntityManager manager =	utill.getManager();
		return manager.find(FoodEntity.class, id);
	}

	@Override
	public void update(int id, FoodEntity newentity) {
		EntityManager manager =	utill.getManager();
		FoodEntity oldEntity = readById(id);

		if(oldEntity!=null) {

			oldEntity.setFoodCatogery(newentity.getFoodCatogery());
			oldEntity.setFoodName(newentity.getFoodName());
			oldEntity.setPrice(newentity.getPrice());
			oldEntity.setVeg(newentity.isVeg());

			manager.getTransaction().begin();
			manager.merge(oldEntity);
			manager.getTransaction().commit();
			System.out.println("repo method");
			manager.close();

		}
	}


}
