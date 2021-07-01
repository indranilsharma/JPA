package com.indranil.mapping;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.indranil.entity.Student;
import com.indranil.entity.Teacher;

public class ManyToManyExample {

	
	public static void main(String[] args) {
		
		EntityManagerFactory factory = Persistence.createEntityManagerFactory("Mapping_Type"); 
		EntityManager manager =factory.createEntityManager();
		
		manager.getTransaction().begin();

		
		Student s1 = new Student(12,"Napit","Lom","n@gmail.com",null);

		manager.persist(s1);
		
		ArrayList<Student> list = new ArrayList<Student>();
      	list.add(s1);
		
		Teacher t= new Teacher(1,"Nanda",list);

		manager.persist(t);
	   
		manager.getTransaction().commit();
		
		System.out.println("sucessful");
		manager.close();
	    factory.close();
		
	}
	

}
