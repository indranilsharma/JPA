package com.indranil.curd.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;

import com.indranil.curd.entity.Employee;

@Repository
public class Employee_JPA_DAO_Impl implements EmployeeDAO {

	private EntityManager entityManager;

	public Employee_JPA_DAO_Impl(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	public List<Employee> findAll() {

		Query query = entityManager.createQuery("from Employee", Employee.class);

		List<Employee> resultList = query.getResultList();

		return resultList;
	}

	@Override
	public Employee findById(int theId) {

		Employee employee = entityManager.find(Employee.class, theId);
		return employee;
	}

	@Override
	public void save(Employee theEmployee) {

		// if id==0 then insert or save else update
		Employee dbEmpoyee = entityManager.merge(theEmployee);

		// update from db so we can generate new id
		theEmployee.setId(dbEmpoyee.getId());

	}

	@Override
	public void deleteById(int theId) {

		Query query = entityManager.createQuery("from Employee where id=:employeeId");

		query.setParameter("employeeId", theId);
		query.executeUpdate();
	}

}
