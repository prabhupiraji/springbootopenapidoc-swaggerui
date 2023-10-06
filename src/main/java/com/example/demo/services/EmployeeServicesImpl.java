package com.example.demo.services;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.model.Employee;
import com.example.demo.repository.EmployeeRepository;

@Service
public class EmployeeServicesImpl  {
	 @Autowired
EmployeeRepository employeeRepository;
	


public Employee saveEmployee( Employee employee) {
	return employeeRepository.save(employee);
}
public List<Employee> getEmployees() {
	
	return employeeRepository.findAll();
}

public Employee getEmployee(long id) {
	return  employeeRepository.getById( id);
}

public Employee updateEmployee(Employee employee, long id) {
	Employee existingEmployee= employeeRepository.findById(id).orElseThrow( );	
	existingEmployee.setFirstname(employee.getFirstname());
	existingEmployee.setLastname(employee.getLastname());
	existingEmployee.setEmail(employee.getEmail());
	employeeRepository.save(existingEmployee);
	return existingEmployee;
}
public void deleteEmployee(long id) {
	employeeRepository.findById(id).orElseThrow( );
	employeeRepository.deleteById(id);	
}


}
