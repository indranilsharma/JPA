package com.indranil.curd.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.indranil.curd.entity.Employee;

@Repository
public class Employee_Hibernate_DAO_Impl implements EmployeeDAO {

	private EntityManager entityManager;

	@Autowired
	public Employee_Hibernate_DAO_Impl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}

	@Override
	// @Transactional // no need to manually start transaction
	public List<Employee> findAll() {
		Session session = entityManager.unwrap(Session.class);

		// Employee it should be java obj
		Query<Employee> query = session.createQuery("from Employee", Employee.class);

		List<Employee> resultList = query.getResultList();

		/*
		 * resultList.forEach((temp) -> { System.out.println("Employee :" + temp); });
		 */
		return resultList;
	}

	@Override
	public Employee findById(int theId) {
		Session session = entityManager.unwrap(Session.class);

		Employee theEmployee = session.get(Employee.class, theId);
		return theEmployee;
	}

	@Override
	public void save(Employee theEmployee) {
		Session session = entityManager.unwrap(Session.class);
		session.saveOrUpdate(theEmployee);
	}

	@Override
	public void deleteById(int theId) {
		Session session = entityManager.unwrap(Session.class);
		Query query = session.createQuery("delete from Employee where id=:employeeId");

		query.setParameter("employeeId", theId);
		query.executeUpdate();
	}

}
