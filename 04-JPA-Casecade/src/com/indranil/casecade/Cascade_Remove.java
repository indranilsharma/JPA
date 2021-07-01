package com.indranil.casecade;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.indranil.entity.Student;

public class Cascade_Remove {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Casecade_Type");

		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Student s = em.find(Student.class, 707);
		em.remove(s);

		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}
