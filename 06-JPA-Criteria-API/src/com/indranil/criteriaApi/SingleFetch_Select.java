package com.indranil.criteriaApi;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.indranil.entity.Student;

public class SingleFetch_Select {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("criteria_api");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();

		CriteriaBuilder builder = manager.getCriteriaBuilder();
		CriteriaQuery<Student> createQuery = builder.createQuery(Student.class);

		Root<Student> student = createQuery.from(Student.class);

		createQuery.select(student.get("first_name"));

		CriteriaQuery<Student> select = createQuery.select(student);

		TypedQuery<Student> typedQuery = manager.createQuery(select);
		List<Student> list = typedQuery.getResultList();

		System.out.println("Name  id");

		for (Student tempStu : list) {
			System.out.print(tempStu.getFirst_name());
			System.out.print(" ");
			System.out.println(tempStu.getId());
		}

		manager.getTransaction().commit();

		manager.close();
		factory.close();

	}

}
