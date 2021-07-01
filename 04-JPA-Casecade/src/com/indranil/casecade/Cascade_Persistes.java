package com.indranil.casecade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.indranil.entity.Locker;
import com.indranil.entity.Student;

public class Cascade_Persistes {

	public static void main(String[] args) {


		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Casecade_Type");

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Student s1 = new Student();
		
		s1.setId(707);
		s1.setFirst_name("Vipul");
		s1.setLast_name("Sharma");
		s1.setEmail("v@gmail.com");

		Locker l1 = new Locker();
		l1.setName("ENGLISH");
		l1.setId(s1.getId());

		s1.setLocker(l1);

		em.persist(s1);
		
		
		em.getTransaction().commit();

		em.close();
		emf.close();

		
		
	}

}
