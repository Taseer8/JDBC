package com.xworkz.utill;


import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;


public class FoodUtill {

	public EntityManager getManager() {
		EntityManagerFactory manager = Persistence.createEntityManagerFactory("com.xworkz");
		return manager.createEntityManager() ;
	}
}
