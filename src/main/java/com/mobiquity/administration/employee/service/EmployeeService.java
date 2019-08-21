/**
 * 
 */
package com.mobiquity.administration.employee.service;

import java.util.List;

import com.mobiquity.administration.employee.dao.EmployeeDAO;
import com.mobiquity.administration.employee.model.Employees;

/**
 * @author dharitachokshi
 *
 */
public interface EmployeeService {

	public List<EmployeeDAO> getEmployees();

	public Employees saveEmployee(Employees employee);

}
