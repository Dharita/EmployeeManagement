/**
 * 
 */
package com.mobiquity.administration.employee.service.impl;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobiquity.administration.employee.dao.EmployeeDAO;
import com.mobiquity.administration.employee.model.Employees;
import com.mobiquity.administration.employee.repository.EmployeeRepository;
import com.mobiquity.administration.employee.service.EmployeeService;

/**
 * @author dharitachokshi
 *
 */
@Service
public class EmployeeServiceImpl implements EmployeeService {

	@Autowired
	private EmployeeRepository employeeRepository;

	@Override
	public List<EmployeeDAO> getEmployees() {
		List<Employees> employees = employeeRepository.findAll();
		List<EmployeeDAO> employeeDAOs = null;
		if (!employees.isEmpty()) {
			employeeDAOs = employees.stream().map(employee -> new EmployeeDAO(employee)).collect(Collectors.toList());
		} else {
			employeeDAOs = new ArrayList<>();
		}
		return employeeDAOs;
	}

	@Override
	public Employees saveEmployee(Employees employee) {
		return employeeRepository.save(employee);
	}
}
