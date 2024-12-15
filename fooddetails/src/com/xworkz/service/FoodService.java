package com.xworkz.service;

import com.xworkz.entity.FoodEntity;

public interface FoodService {
	
	public void saveAndValidate(FoodEntity entity);
	public void readById();
	public void updated(FoodEntity entity);

}
