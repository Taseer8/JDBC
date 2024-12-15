package com.xworkz.carRentalMangemant.runner;

import com.xworkz.carRentalMangemant.entity.UserRegisterEntity;
import com.xworkz.carRentalMangemant.repo.CarRentalRepoImpl;
import com.xworkz.carRentalMangemant.repo.CarRetalRepo;
import com.xworkz.carRentalMangemant.service.CarRentalService;
import com.xworkz.carRentalMangemant.service.CarRentalServiceImpl;

public class CarRntal {

	public static void main(String[] args) {
		
		UserRegisterEntity userEntity = new UserRegisterEntity();
		userEntity.setUserName("taseer");
		userEntity.setUserEmail("taseer2@gmail.com");
		userEntity.setUserAddress("ballari");
		userEntity.setUserNumber("7022618056");
		
		CarRetalRepo repo = new CarRentalRepoImpl();
		CarRentalService service = new CarRentalServiceImpl(repo);
		service.saveAndValidate(userEntity);
		service.readById();
		service.deleteById("taseer1@gmail.com");
		
		
		
	}

}
