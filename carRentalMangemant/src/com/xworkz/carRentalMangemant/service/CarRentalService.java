package com.xworkz.carRentalMangemant.service;

import com.xworkz.carRentalMangemant.entity.UserRegisterEntity;

public interface CarRentalService {
	
	public String saveAndValidate(UserRegisterEntity entity);
	public void readById();
	public void deleteById(String email);

}
