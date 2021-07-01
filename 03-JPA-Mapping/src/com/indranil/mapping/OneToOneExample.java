package com.indranil.mapping;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.indranil.entity.Library;
import com.indranil.entity.Student;

public class OneToOneExample {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Mapping_Type");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Student s1 = new Student();
		s1.setId(666);
		s1.setFirst_name("Vipul");
		s1.setLast_name("Sharma");
		s1.setEmail("vs@sharma");

		Student s2 = new Student();

		s2.setId(333);
		s2.setFirst_name("Vipul");
		s2.setLast_name("Sharma");
		s2.setEmail("vs@sharma");

		em.persist(s1);
		em.persist(s2);

		Library lib1 = new Library();

		lib1.setId(444);
		lib1.setName("Data Structure");

		s1.setLibrary(lib1);
		
		
		lib1.setStudent(s1);

		Library lib2 = new Library();
		lib2.setId(222);
		lib2.setName("DBMS");

		lib2.setStudent(s2);

		s2.setLibrary(lib2);
		
		em.persist(lib1);
		em.persist(lib2);

		System.out.println("success");
		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}
