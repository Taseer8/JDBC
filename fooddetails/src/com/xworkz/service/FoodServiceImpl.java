package com.xworkz.service;

import com.xworkz.entity.FoodEntity;
import com.xworkz.repo.FoodRepo;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class FoodServiceImpl implements FoodService {
	private FoodRepo repo;

	@Override
	public void saveAndValidate(FoodEntity entity) {
		if(entity!=null) {
			repo.save(entity);

		}

	}

	@Override
	public void readById() {
		FoodEntity read = repo.readById(1);
		System.out.println(read);
	}

	@Override
	public void updated(FoodEntity entity) {
		
		repo.update(2, entity);
		
	}

}
