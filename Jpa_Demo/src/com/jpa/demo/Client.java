package com.jpa.demo;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Client {

	public static void main(String[] args) {
		
		EntityManagerFactory factory=Persistence.createEntityManagerFactory("jpa_crud");
		
		EntityManager em=factory.createEntityManager();//insert,update,select,delete
		
		em.getTransaction().begin();
		
		Employee emp=new Employee(100, "Stella", 1000, "HR");
		
		em.persist(emp);
		
		System.out.println("Data is inserted");
		
		Employee emp1=em.find(Employee.class, 100);//select * from employee where empid=100;
		
		System.out.println("Data fetched from the database:"+ emp1);
		
		emp.setEmpSal(100000);
		em.merge(emp);
		System.out.println("updated data:"+ emp);
		
		em.remove(emp);
		
		em.getTransaction().commit();
		
		em.close();
		factory.close();
		
		
		
	}

}
