package com.cap.dao;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class UtilJava {

	private static EntityManagerFactory factory;
	
	private static EntityManager entityManager;
 
	static {
		factory = Persistence.createEntityManagerFactory("mysql");
	}
	
	public static EntityManager getEntityManager() {
		if(entityManager==null || !entityManager.isOpen()) {
			entityManager = factory.createEntityManager();
		}
		return entityManager;
	}
	
	 
}
