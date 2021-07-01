package com.indranil.collection;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.indranil.entity.Address;
import com.indranil.entity.Employee;

public class SetMapping {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Collection_Type");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Address a2 = new Address();

		a2.setPincode(70061);
		a2.setCity("Siliguri");
		a2.setState("W.B");

		Address a3 = new Address();

		a3.setPincode(70061);
		a3.setCity("Siliguri");
		a3.setState("W.B");

		Address a4 = new Address();

		a4.setPincode(70061);
		a4.setCity("Siliguri");
		a4.setState("W.B");

		Address a5 = new Address();

		a5.setPincode(70061);
		a5.setCity("Siliguri");
		a5.setState("W.B");

		Employee e1 = new Employee();

		e1.setId(612);
		e1.setName("Bush");

		Employee e2 = new Employee();

		e2.setId(611);
		e2.setName("Bush");

		Employee e3 = new Employee();

		e3.setId(610);
		e3.setName("Bush");

		Employee e4 = new Employee();

		e4.setId(613);
		e4.setName("Bush");

		e1.getAddress_Set().add(a2);
		e2.getAddress_Set().add(a3);
		e3.getAddress_Set().add(a4);
		e4.getAddress_Set().add(a5);

		em.persist(e1);
		em.persist(e2);
		em.persist(e3);
		em.persist(e4);

		em.getTransaction().commit();

		em.close();
		emf.close();

	}

}
