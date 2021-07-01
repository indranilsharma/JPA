package com.indranil.collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.indranil.entity.Address;
import com.indranil.entity.Employee;

public class ListMapping {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Collection_Type");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Address a1 = new Address();
		
		a1.setPincode(560036);
		a1.setCity("Bangalore");
		a1.setState("KA");
	

		Address a2 = new Address();
		
		a2.setPincode(560037);
		a2.setCity("Bangalore-urban");
		a2.setState("KA");

		Employee e1 = new Employee();
		
		e1.setId(510);
		e1.setName("Roney");
		
	
		
		Employee e2 = new Employee();
		
		e2.setId(511);
		e2.setName("Auro");
		
		e1.getAddress_list().add(a1);
		e2.getAddress_list().add(a2);

		
		System.out.println("success" +e1+e1.getAddress_list());
		
		
		
		em.persist(e1);
		em.persist(e2);
		
		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}
