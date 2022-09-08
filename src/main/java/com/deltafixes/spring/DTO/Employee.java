package com.deltafixes.spring.DTO;

public class Employee {

	private int employeeid;
	
	private String firstname;
	private String lastname;
	 
    private String email;   
	
	private String password;
	
	private String role;
	

	public Employee() {
		super();
	
	}
	public Employee(int employeeid, String firstname, String lastname, String email) {
		super();
	}
	
	public Employee(String firstname, String lastname, String email, String password, String role) {
		super();
	}
	
	public Employee(String firstname, String lastname, String email, String role) {
		super();
	}

	public int getEmployeeid() {
		return employeeid;
	}
	public void setEmployeeid(int employeeid) {
		this.employeeid = employeeid;
	}
	public String getFirstname() {
		return firstname;
	}
	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}
	public String getLastname() {
		return lastname;
	}
	public void setLastname(String lastname) {
		this.lastname = lastname;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getRole() {
		return role;
	}
	public void setRole(String role) {
		this.role = role;
	}
}
