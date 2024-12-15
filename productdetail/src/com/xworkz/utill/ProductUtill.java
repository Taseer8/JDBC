package com.xworkz.utill;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class ProductUtill {

	public EntityManager getFactory() {
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("com.xworkz");
		return  factory.createEntityManager();

	}
}