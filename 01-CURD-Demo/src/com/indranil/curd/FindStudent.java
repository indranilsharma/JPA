package com.indranil.curd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.indranil.entity.Student;

public class FindStudent {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Student_details");
		EntityManager em = emf.createEntityManager();

		Student s = em.find(Student.class, 1);

		System.out.println("Student id = " + s.getId());
		System.out.println("Student First name = " + s.getFirst_name());
		System.out.println("Student Last name = " + s.getLast_name());
		System.out.println("Student Email = " + s.getEmail());

	}

}
