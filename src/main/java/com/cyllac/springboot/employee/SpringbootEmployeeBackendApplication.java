package com.cyllac.springboot.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import com.cyllac.springboot.employee.entity.Employee;
import com.cyllac.springboot.employee.repository.EmployeeRepository;

@SpringBootApplication
public class SpringbootEmployeeBackendApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(SpringbootEmployeeBackendApplication.class, args);
	}

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void run(String... args) throws Exception {
		
		Employee employee1 = Employee.builder()
				.firstName("Priscila")
				.lastName("Kannenberg")
				.email("teste@teste.com.br")
				.build();
		
		Employee employee2 = Employee.builder()
				.firstName("Denis")
				.lastName("Kannenberg")
				.email("teste2@teste.com.br")
				.build();
		
		Employee employee3 = Employee.builder()
				.firstName("Tony")
				.lastName("Stark")
				.email("teste3@teste.com.br")
				.build();
		
		employeeRepository.save(employee1);
		employeeRepository.save(employee2);
		employeeRepository.save(employee3);
	}

}
