package com.indranil.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.indranil.entity.Cariculam;
import com.indranil.entity.Student;

public class ManyToOneExample {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Mapping_Type");
		
		EntityManager manager = factory.createEntityManager();
		
		manager.getTransaction().begin();
		
		Cariculam c = new Cariculam();
		c.setId(2);
		c.setName("CSE");
		
		manager.persist(c);
		
		
		Student student = new Student();
		student.setId(10);
		student.setFirst_name("Jonty");
		student.setLast_name("Rodes");
		student.setEmail("j@gmail.com");
		
		student.setCariculam(c);
		
		manager.persist(student);
		
		manager.getTransaction().commit();
		
		manager.close();
		factory.close();
	
	}

}
