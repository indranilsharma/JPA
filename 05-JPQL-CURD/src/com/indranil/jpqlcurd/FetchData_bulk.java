package com.indranil.jpqlcurd;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.indranil.entity.Student;

public class FetchData_bulk {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpql_curd");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Query query = em.createQuery("Select s from Student s ");

		@SuppressWarnings("unchecked")
		List<Student> list = (List<Student>) query.getResultList();

		System.out.print("id");
		System.out.print("\t first_name");
		System.out.println("\t last_age");

		for (Student s : list) {
			System.out.print(s.getId());
			System.out.print("\t" + s.getFirst_name());
			System.out.print("\t" + s.getLast_name());
			System.out.println();
		}
		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
