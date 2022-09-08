package com.deltafixes.spring.Controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.deltafixes.spring.DTO.Employee;
import com.deltafixes.spring.DTO.User;
import com.deltafixes.spring.Service.EmployeeService;

@Controller
@RequestMapping(value = "/login")
public class LoginController {
	
@Autowired
EmployeeService empservice;
	
	@RequestMapping(value = "/validate", method = RequestMethod.POST)
	public ModelAndView displayLogIn(HttpSession Session, @ModelAttribute("user") User user, Model model) {
		ModelAndView mav = new ModelAndView();
		String email = user.getEmail();
		String password = user.getPassword();
        
		Employee empl = empservice.findEmployeeByEmail(email);
		if (empl.getPassword().equals(password)) {

			if (empl.getRole().equals("employee")) {
				empl.setPassword("");
				mav.addObject("emp", empl);
				mav.setViewName("welcome");
				Session.setAttribute("user", user);
				Session.setAttribute("email", email);
				Session.setAttribute("password", password);
				return mav;
			} else {
				empl.setPassword("");
				mav.addObject("emp", empl);
				mav = new ModelAndView("emppage");
				List<Employee> list = empservice.getlistOfEmployees();
				mav.addObject("listEmployees", list);
				Session.setAttribute("user", user);
				Session.setAttribute("email", email);
				Session.setAttribute("password", password);
		
				return mav;
			}
		} else {

			return mav;
		}
	}
	
	
	
	@RequestMapping(value = "/logOutUser", method = RequestMethod.GET)
	public ModelAndView logOUtUser(HttpSession Session) {
		String msg = null;
		ModelAndView mav = new ModelAndView("redirect:/", "LoggedOutSuccessfully", msg);
		mav.addObject("user", new User());
		Session.removeAttribute("user");
		Session.removeAttribute("email");
		Session.removeAttribute("password");
		
		Session.invalidate();
		return mav;
	}
}