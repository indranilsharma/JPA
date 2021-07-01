package com.indranil.jpqlcurd;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class UpdataData {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("jpql_curd");
		EntityManager em = emf.createEntityManager();
		em.getTransaction().begin();

		Query query = em.createQuery("update Student SET first_name = 'Rayen' where id=32");
		query.executeUpdate();

		em.getTransaction().commit();
		System.out.println("Updated");
		em.close();
		emf.close();

	}

}
