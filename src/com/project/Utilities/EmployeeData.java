package com.project.Utilities;

public class EmployeeData {
	private String firstName;
	private String lastName;
	private String emailId;
	private String gender;
	private double salary;
	private long phone;

	EmployeeAddress employeeAddress;

	public void setEmployeeAddress(EmployeeAddress employeeAddress) {
		this.employeeAddress = employeeAddress;
	}

	public EmployeeAddress getEmployeeAddress() {
		return this.employeeAddress;
	}

	EmployeeContact employeecontact;

	public void setEmployeeContact(EmployeeContact employeecontact) {
		this.employeecontact = employeecontact;
	}

	public EmployeeContact getEmployeeContact() {
		return this.employeecontact;
	}

	public void setfirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getfirstName() {
		return this.firstName;
	}

	public void setlastName(String lastName) {
		this.lastName = lastName;
	}

	public String getlastName() {
		return this.lastName;
	}

	public void setemailId(String emailId) {
		this.emailId = emailId;
	}

	public String getemailId() {
		return this.emailId;
	}

	public void setgender(String gender) {
		this.gender = gender;
	}

	public String getgender() {
		return this.gender;
	}

	public void setsalary(double salary) {
		this.salary = salary;
	}

	public double getsalary() {
		return this.salary;
	}

	public void setphone(long phone) {
		this.phone = phone;
	}

	public long getphone() {
		return this.phone;
	}

}
