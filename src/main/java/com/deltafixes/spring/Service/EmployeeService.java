package com.deltafixes.spring.Service;

import java.util.List;

import com.deltafixes.spring.DTO.Employee;

public interface EmployeeService {

	public List<Employee> getlistOfEmployees();

	public void addEmployee(Employee emp);

	public void deleteEmployee(int id);

	public Employee findEmployee(int id);

	public void updateEmployee(Employee e);

	public Employee findEmployeeByEmail(String email);

}
