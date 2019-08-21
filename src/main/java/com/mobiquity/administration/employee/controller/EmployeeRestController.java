/**
 * 
 */
package com.mobiquity.administration.employee.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mobiquity.administration.employee.dao.EmployeeDAO;
import com.mobiquity.administration.employee.model.Employees;
import com.mobiquity.administration.employee.service.EmployeeService;

/**
 * @author dharitachokshi
 *
 */
@RestController
@RequestMapping(path = "/employees")
public class EmployeeRestController {

	@Autowired
	private EmployeeService employeeService;

	@GetMapping(path = "/", produces = "application/json")
	public ResponseEntity<List<EmployeeDAO>> getEmployees() {
		ResponseEntity<List<EmployeeDAO>> responseEntity;
		List<EmployeeDAO> employees = employeeService.getEmployees();
		System.out.println("employees::: "+ employees);

		if (employees != null && !employees.isEmpty()) {
			responseEntity = new ResponseEntity<>(employees, HttpStatus.OK);
		} else {
			responseEntity = new ResponseEntity<>(HttpStatus.NO_CONTENT);
		}
		return responseEntity;
	}

	@PostMapping(path = "/", consumes = "application/json", produces = "application/json")
	public ResponseEntity<Employees> addEmployee(@RequestBody Employees employee) {
		ResponseEntity<Employees> responseEntity;
		Employees employees = employeeService.saveEmployee(employee);

		if (employees != null) {
			responseEntity = new ResponseEntity<>(employees, HttpStatus.CREATED);
		} else {
			responseEntity = new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
		return responseEntity;
	}
}
