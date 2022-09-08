package com.deltafixes.spring.DAO;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DataAccessException;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import com.deltafixes.spring.DTO.Employee;

@Service
public class EmployeeDaoImpl implements EmployeeDao {

	JdbcTemplate template;

	@Autowired
	public void setTemplate(JdbcTemplate template) throws DataAccessException {
		this.template = template;
	}

	private Employee EmployeeMapper(ResultSet rs, int rowNum) throws SQLException {
		Employee employee = new Employee();
		employee.setEmployeeid(rs.getInt("employeeid"));
		employee.setFirstname(rs.getString("firstname"));
		employee.setLastname(rs.getString("lastname"));
		employee.setEmail(rs.getString("email"));
		employee.setPassword(rs.getString("password"));
		employee.setRole(rs.getString("role"));

		return employee;
	}

	public List<Employee> getlistOfEmployees() {
		String query = "select  employeeid,firstname,lastname,email,password,role from employee";
		return template.query(query, this::EmployeeMapper);

	}

	public void addEmployee(Employee emp) {
		String query = "insert into employee(firstname,lastname,email,password,role) values(?,?,?,?,?)";

		template.update(query, emp.getFirstname(), emp.getLastname(), emp.getEmail(),
				emp.getPassword(), emp.getRole());

	}

	public void deleteEmployee(int id) {
		String query = "delete from employee where employeeid = ?";
		template.update(query, id);
	}

	@Override
	public void updateEmployee(Employee e) {
		String query = "update employee set firstname = ?, lastname = ?, email = ?, role =? where employeeid = ?";
		template.update(query, e.getFirstname(), e.getLastname(), e.getEmail(), e.getRole(), e.getEmployeeid());
	}

	@Override
	public Employee findEmployee(int id) {
		String query = "select employeeid,firstname,lastname,email,password,role from employee where employeeid = ? ";
		return template.queryForObject(query, this::EmployeeMapper, id);
	}

	@Override
	public Employee findEmployeeByEmail(String email) {
		String query = "select employeeid,firstname,lastname,email,password,role from employee where email =?";
		return template.queryForObject(query, this::EmployeeMapper, email);
	}

}
