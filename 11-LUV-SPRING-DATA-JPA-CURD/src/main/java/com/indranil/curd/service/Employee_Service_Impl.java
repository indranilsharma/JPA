package com.indranil.curd.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.indranil.curd.dao.EmployeeRepository;
import com.indranil.curd.entity.Employee;

@Service
public class Employee_Service_Impl implements EmployeeService {

	private EmployeeRepository employeeRepository;

	@Autowired
	public Employee_Service_Impl(EmployeeRepository employeeRepository) {
		this.employeeRepository = employeeRepository;
	}

	@Override
	
	public List<Employee> findAll() {
		return employeeRepository.findAll();
	}

	@Override
	public Employee findById(int theId) {

		Optional<Employee> optional = employeeRepository.findById(theId);

		Employee theEmployee = null;

		if (optional.isPresent()) {
			theEmployee = optional.get();
		} else {
			throw new RuntimeException("Did not find employee id - " + theId);
		}
		return theEmployee;

	}

	@Override
	public void save(Employee theEmployee) {
		employeeRepository.save(theEmployee);
	}

	@Override
	public void deleteById(int theId) {
		employeeRepository.deleteById(theId);
	}

}
