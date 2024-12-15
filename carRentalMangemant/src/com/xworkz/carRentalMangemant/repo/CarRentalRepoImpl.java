package com.xworkz.carRentalMangemant.repo;

import javax.persistence.EntityManager;

import com.xworkz.carRentalMangemant.entity.UserRegisterEntity;
import com.xworkz.carRentalMangemant.utill.CarUtill;

public class CarRentalRepoImpl implements CarRetalRepo {
	
	
	CarUtill utill = new CarUtill();

	@Override
	public void save(UserRegisterEntity entity) {
		EntityManager manger =	 utill.getFactory();
		manger.getTransaction().begin();
		manger.persist(entity);
		manger.getTransaction().commit();
		manger.close();
	}

	@Override
	public UserRegisterEntity findById(String email) {
		EntityManager manger =	 utill.getFactory();
		return manger.find(UserRegisterEntity.class, email);
	}

	@Override
	public void deleteById(String email) {
		EntityManager manger =	 utill.getFactory();
		UserRegisterEntity delete =	manger.find(UserRegisterEntity.class, email);
		manger.remove(delete);
	}


}
