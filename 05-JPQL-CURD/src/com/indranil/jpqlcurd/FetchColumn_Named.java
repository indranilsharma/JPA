package com.indranil.jpqlcurd;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import com.indranil.entity.Student_Named;

public class FetchColumn_Named {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpql_curd");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Query query_1 = em.createNamedQuery("find name");
		@SuppressWarnings("unchecked")
		List<Student_Named> list = query_1.getResultList();

		System.out.println("Student Name :");

		for (Student_Named s : list) {

			System.out.print(s.getFirst_name() + " ");
			System.out.println(s.getLast_name());

		}

		em.close();
		emf.close();

	}

}
