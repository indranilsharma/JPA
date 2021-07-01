package com.indranil.curd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.indranil.entity.Student;

public class PersistStudent {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Student s1 = new Student();
		s1.setId(200);
		s1.setFirst_name("Jack");
		s1.setLast_name("More");
		s1.setEmail("jhon@gmail.com");
		
		em.persist(s1);
		
		System.out.println("Success");
		
		em.getTransaction().commit();

		em.close();
		emf.close();
		

	}

}
