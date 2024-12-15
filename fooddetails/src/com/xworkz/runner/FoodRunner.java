package com.xworkz.runner;

import com.xworkz.entity.FoodEntity;
import com.xworkz.repo.FoodRepo;
import com.xworkz.repo.FoodRepoImpl;
import com.xworkz.service.FoodService;
import com.xworkz.service.FoodServiceImpl;

public class FoodRunner {

	public static void main(String[] args) {
		
		FoodEntity entity = new FoodEntity();
		entity.setFoodName("briyani");
		entity.setFoodCatogery("main course");
		entity.setPrice(399.00);
		entity.setVeg(false);
		
		FoodRepo repo = new FoodRepoImpl();
		FoodService service = new FoodServiceImpl(repo);
		service.saveAndValidate(entity);
		service.readById();
		
		FoodEntity entityNew = new FoodEntity();
		entityNew.setFoodName("veg");
		entityNew.setFoodCatogery("main course");
		entityNew.setPrice(299.00);
		entityNew.setVeg(true);
		service.updated(entityNew);

	}

}
