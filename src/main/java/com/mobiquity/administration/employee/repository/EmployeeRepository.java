/**
 * 
 */
package com.mobiquity.administration.employee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mobiquity.administration.employee.model.Employees;

/**
 * @author dharitachokshi
 *
 */
@Repository
public interface EmployeeRepository extends JpaRepository<Employees, Integer> {

}
