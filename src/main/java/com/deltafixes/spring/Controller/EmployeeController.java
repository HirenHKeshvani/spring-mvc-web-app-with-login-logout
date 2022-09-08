package com.deltafixes.spring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.deltafixes.spring.DTO.Employee;
import com.deltafixes.spring.Service.EmployeeService;

@Controller
@RequestMapping(value = "/employee")
public class EmployeeController {

	@Autowired
	EmployeeService EmpService;

	@RequestMapping(value = "/list", method = RequestMethod.GET)
	public ModelAndView listEmployees() {
		ModelAndView mvn = new ModelAndView("emppage");
		List<Employee> list = EmpService.getlistOfEmployees();
		mvn.addObject("listEmployees", list);
		return mvn;
	}

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public ModelAndView addEmployee() {
		ModelAndView mvn = new ModelAndView("employee_form");
		Employee employee = new Employee();
		mvn.addObject("employeeForm", employee);
		return mvn;
	}

	@RequestMapping(value = "/update/{employeeid}", method = RequestMethod.GET)
	public ModelAndView updateEmployee(@PathVariable("employeeid") int employeeid) {
		Employee empl = EmpService.findEmployee(employeeid);
		ModelAndView mvn = new ModelAndView("employee_form");
		mvn.addObject("employeeForm", empl);
		return mvn;
	}

	@RequestMapping(value = "/save", method = RequestMethod.POST)
	public ModelAndView save(@ModelAttribute("employeeform") Employee employee) {
		if (employee.getEmployeeid() == 0) {
			EmpService.addEmployee(employee);
		} else {
			EmpService.updateEmployee(employee);
		}
		return new ModelAndView("redirect:/employee/list");

	}

	@RequestMapping(value = "/delete/{employeeid}", method = RequestMethod.GET)
	public ModelAndView deleteEmployee(@PathVariable("employeeid") int employeeid) {
		EmpService.deleteEmployee(employeeid);
		return new ModelAndView("redirect:/employee/list");

	}

}
