/**
 * 
 */
package com.mobiquity.administration.employee.dao;

import java.util.Date;

import com.mobiquity.administration.employee.model.Employees;

import lombok.Getter;
import lombok.Setter;

/**
 * @author dharitachokshi
 *
 */
@Getter
@Setter
public class EmployeeDAO {

	private int id;
	private String firstName;
	private String lastName;
	private String contactNumber;
	private String employeeId;
	private Date dateOfJoining;

	public EmployeeDAO(Employees employee) {
		this.employeeId = employee.getEmployeeId();
		this.id = employee.getId();
		this.firstName = employee.getFirstName();
		this.lastName = employee.getLastName();
		this.dateOfJoining = employee.getDateOfJoining();
	}

	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}

	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}

	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * @return the contactNumber
	 */
	public String getContactNumber() {
		return contactNumber;
	}

	/**
	 * @param contactNumber the contactNumber to set
	 */
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}

	/**
	 * @return the employeeId
	 */
	public String getEmployeeId() {
		return employeeId;
	}

	/**
	 * @param employeeId the employeeId to set
	 */
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}

	/**
	 * @return the dateOfJoining
	 */
	public Date getDateOfJoining() {
		return dateOfJoining;
	}

	/**
	 * @param dateOfJoining the dateOfJoining to set
	 */
	public void setDateOfJoining(Date dateOfJoining) {
		this.dateOfJoining = dateOfJoining;
	}

}
