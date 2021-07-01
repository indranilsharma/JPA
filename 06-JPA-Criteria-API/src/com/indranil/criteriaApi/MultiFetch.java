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

public class MultiFetch {

	public static void main(String[] args) {

		EntityManagerFactory factory = Persistence.createEntityManagerFactory("criteria_api");
		EntityManager manager = factory.createEntityManager();
		manager.getTransaction().begin();
		
		CriteriaBuilder builder = manager.getCriteriaBuilder();
        CriteriaQuery<Student> criteriaQuery = builder.createQuery(Student.class);   		
        
        Root<Student> root = criteriaQuery.from(Student.class);
        
        criteriaQuery.multiselect(root.get("id"),root.get("first_name"),root.get("last_name"));
        criteriaQuery.orderBy(builder.desc(root.get("id")));
       
        CriteriaQuery<Student> select = criteriaQuery.select(root);
        
        TypedQuery<Student> typedQuery = manager.createQuery(select);
        
        List<Student> list = typedQuery.getResultList();
        
        System.out.println("Id "+"first_name "+"last_name ");
        
        for (Student student : list) {
			System.out.println(student.getId()+" "+student.getFirst_name()+" "+student.getLast_name());
		}
		
		
		
	}

}
