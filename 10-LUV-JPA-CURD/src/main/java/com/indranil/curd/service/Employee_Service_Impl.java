package com.indranil.curd.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.indranil.curd.dao.EmployeeDAO;
import com.indranil.curd.entity.Employee;

@Service
public class Employee_Service_Impl implements EmployeeService {

	private EmployeeDAO employeeDAO;

	@Autowired
	//@Qualifier will decided wich bean will @Qualifi
	public Employee_Service_Impl(@Qualifier("employee_JPA_DAO_Impl")EmployeeDAO employeeDAO) {
		this.employeeDAO = employeeDAO;
	}

	@Override
	@Transactional
	public List<Employee> findAll() {
		return employeeDAO.findAll();
	}

	@Override
	@Transactional
	public Employee findById(int theId) {
		return employeeDAO.findById(theId);
	}

	@Override
	@Transactional
	public void save(Employee theEmployee) {
		employeeDAO.save(theEmployee);
	}

	@Override
	@Transactional
	public void deleteById(int theId) {
		employeeDAO.deleteById(theId);
	}

}
