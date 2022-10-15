package com.cyllac.springboot.employee;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

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
//		Employee employee = new Employee();
//		employee.setFirstName("Priscila");
//		employee.setLastName("Kannenberg");
//		employee.setEmailId("teste@teste.com.br");
//		employeeRepository.save(employee);
//		
//		Employee employee1 = new Employee();
//		employee1.setFirstName("Denis");
//		employee1.setLastName("Cena");
//		employee1.setEmailId("teste1@teste.com.br");
//		employeeRepository.save(employee1);
	}
}
