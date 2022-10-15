package com.cyllac.springboot.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cyllac.springboot.employee.model.Employee;

public interface EmployeeRepository extends JpaRepository<Employee, Long> {

}
