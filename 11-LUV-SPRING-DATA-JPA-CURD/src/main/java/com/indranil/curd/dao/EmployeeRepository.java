package com.indranil.curd.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.indranil.curd.entity.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {

}
