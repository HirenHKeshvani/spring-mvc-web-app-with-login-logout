package com.deltafixes.spring.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.deltafixes.spring.DAO.EmployeeDao;
import com.deltafixes.spring.DTO.Employee;

@Service
public class EmployeeServiceImpl implements EmployeeService {

	EmployeeDao employeedao;

	@Autowired
	public void setEmployeedao(EmployeeDao employeedao) {
		this.employeedao = employeedao;
	}

	@Override
	public List<Employee> getlistOfEmployees() {

		return employeedao.getlistOfEmployees();
	}

	@Override
	public void addEmployee(Employee emp) {
		employeedao.addEmployee(emp);

	}

	@Override
	public void deleteEmployee(int id) {

		employeedao.deleteEmployee(id);
	}

	@Override
	public Employee findEmployee(int id) {

		return employeedao.findEmployee(id);
	}

	@Override
	public void updateEmployee(Employee e) {
		employeedao.updateEmployee(e);

	}

	@Override
	public Employee findEmployeeByEmail(String email) {
		return employeedao.findEmployeeByEmail(email);

	}

}
