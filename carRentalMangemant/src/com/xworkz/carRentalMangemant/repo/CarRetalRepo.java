package com.xworkz.carRentalMangemant.repo;

import com.xworkz.carRentalMangemant.entity.UserRegisterEntity;


public interface CarRetalRepo {
	
	public void save(UserRegisterEntity entity);
	public UserRegisterEntity findById(String email);
	public void deleteById(String email);

}
