package com.deltafixes.spring.DAO;

import java.util.List;

import com.deltafixes.spring.DTO.Employee;

public interface EmployeeDao {

	public List<Employee> getlistOfEmployees();

	public void addEmployee(Employee emp);

	public void deleteEmployee(int id);

	public Employee findEmployee(int id);

	public Employee findEmployeeByEmail(String email);

	public void updateEmployee(Employee e);

}
