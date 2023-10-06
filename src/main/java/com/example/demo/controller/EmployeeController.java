package com.example.demo.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.Employee;
import com.example.demo.services.EmployeeServicesImpl;

import io.swagger.v3.oas.annotations.responses.ApiResponse;
import io.swagger.v3.oas.annotations.tags.Tag;
@RestController
@RequestMapping("/api/employees")
@Tag(name="employee get,post,put,delete controller",description = "employee get,post,put,delete controller")
public class EmployeeController {
	
	@Autowired
 EmployeeServicesImpl employeeServices;

	

@ApiResponse(responseCode = "201",description = "resorce created sucessfully")//we can use same annotation on all other api acording to there response code
@PostMapping("/save")
ResponseEntity<Employee> saveEmployee(@RequestBody Employee employee){
	return new ResponseEntity<Employee>(employeeServices.saveEmployee(employee),HttpStatus.CREATED);
}
@GetMapping
 public List<Employee> getEmployees(){
	return employeeServices.getEmployees();
}
@GetMapping("/{id}")
public Employee getEmployee(@PathVariable("id") long id){
	return employeeServices.getEmployee(id);
}
@PutMapping("/{id}")
public ResponseEntity<Employee> updateEmployee(@PathVariable("id") long id,@RequestBody Employee employee){
	return new ResponseEntity<Employee>(employeeServices.updateEmployee(employee,id),HttpStatus.OK);
}
@DeleteMapping("/{id}")
public ResponseEntity<String> deleteEmployee(@PathVariable("id") long id){
      employeeServices.deleteEmployee(id);
    return new ResponseEntity<String>("deleted record sucessfully",HttpStatus.OK);
}
}