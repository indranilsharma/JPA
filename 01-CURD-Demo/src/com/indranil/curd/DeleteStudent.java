package com.indranil.curd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.indranil.entity.Student;

public class DeleteStudent {

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Student s = em.find(Student.class, 202);
		em.remove(s);
		em.getTransaction().commit();

		System.out.println("success deleted" + s.getId());
		emf.close();
	}

}
