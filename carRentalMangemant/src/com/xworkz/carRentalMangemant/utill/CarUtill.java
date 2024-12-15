package com.xworkz.carRentalMangemant.utill;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class CarUtill {
	
	public EntityManager getFactory() {
	EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
	return  factory.createEntityManager();
	}


}
