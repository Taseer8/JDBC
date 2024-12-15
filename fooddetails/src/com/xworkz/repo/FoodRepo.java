package com.xworkz.repo;

import com.xworkz.entity.FoodEntity;

public interface FoodRepo {
	
	public void save(FoodEntity entity);
	public FoodEntity readById(int id);
	public void update(int id,FoodEntity entity );

}
