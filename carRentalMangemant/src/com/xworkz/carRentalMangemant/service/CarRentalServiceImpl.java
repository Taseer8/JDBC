package com.xworkz.carRentalMangemant.service;

import com.xworkz.carRentalMangemant.entity.UserRegisterEntity;

import com.xworkz.carRentalMangemant.repo.CarRetalRepo;

import lombok.AllArgsConstructor;
@AllArgsConstructor
public class CarRentalServiceImpl implements CarRentalService{
	
//	CarRetalRepo  repo = new CarRentalRepoImpl();
	private CarRetalRepo repo;
		

	@Override
	public String saveAndValidate(UserRegisterEntity entity) {
		if(entity!=null) {
			 repo.save(entity);
			 return "saved successfully";
		}
		return "not saved ";
	}

	@Override
	public void readById() {
		UserRegisterEntity read =	repo.findById("taseer@gmail.com");
		System.out.println(read);
	}

	@Override
	public void deleteById(String email) {
		if(email!=null) {
			repo.deleteById(email);
			UserRegisterEntity read =	repo.findById("taseer1@gmail.com");
			System.out.println("deleted row "+read);
		}
		
	}



}
