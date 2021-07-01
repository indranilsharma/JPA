package com.indranil.mapping;

import java.util.ArrayList;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.indranil.entity.Library;
import com.indranil.entity.Student;

public class OneToManyExample {

	public static void main(String[] args) {

		EntityManagerFactory emf = Persistence.createEntityManagerFactory("Mapping_Type");
		EntityManager em = emf.createEntityManager();

		em.getTransaction().begin();

		Library lib1 = new Library();
		
		lib1.setId(8);
		lib1.setName("Data Structure");

		em.persist(lib1);

		ArrayList<Library> list = new ArrayList<Library>();
		
		list.add(lib1);

		Student st1 = new Student();
		
		st1.setId(8);
		st1.setFirst_name("Vipul");
		st1.setLast_name("Sharma");
		st1.setEmail("Vipul@gmail.com");
		
		st1.setBooks_issued(list);
        st1.setLibrary(lib1);
		
        lib1.setStudent(st1);
		
		
		em.persist(st1);

		em.getTransaction().commit();
		em.close();
		emf.close();

	}

}
