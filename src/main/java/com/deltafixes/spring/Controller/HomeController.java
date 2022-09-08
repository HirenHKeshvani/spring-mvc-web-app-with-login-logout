package com.deltafixes.spring.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.deltafixes.spring.DTO.User;
import com.deltafixes.spring.Service.EmployeeService;




@Controller
@RequestMapping("/")
public class HomeController {
	
	EmployeeService empservice; 
	
	@GetMapping(value="/")
	public ModelAndView login() {
		ModelAndView mav = new ModelAndView("loginpage");
		mav.addObject("user", new User());
		return mav;
	}

}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
//	@RequestMapping(value = "/login", method = RequestMethod.GET)
//	public ModelAndView validate(@ModelAttribute("user") User login){
//		ModelAndView mvn = null;
//		mvn.addObject("loginpage", login);
//		empservice.findEmployeeByEmail(login.getEmail());
//		
//		//ModelAndView mvn = new ModelAndView("z");
//		
//		return null;		
//	}
	
//	@RequestMapping(value ="/login" , method = RequestMethod.GET )
//	public ModelAndView validate(@ModelAttribute("user")User user){
//		ModelAndView mvn = new ModelAndView("loginpage");
//		mvn.addObject("loginpage", user);
//		Employee emp = new Employee();
//	   empservice.findEmployeeByEmail(user.getEmail());
//		String msg = null;
//		String password = user.getPassword();
//		String role = emp.getRole();
//		mvn.addObject("user", user);
//	    if(null != empservice.findEmployeeByEmail(user.getEmail())) {
//	    	if( password == emp.getPassword()){
//	    		if(role =="admin"){
//	    			return new ModelAndView("redirect:/employee/list");
//	    		}
//	    		else{
//	    			return new ModelAndView("redirect:/welcome");
//	    		}
//	    	}else{
//	    		new ModelAndView("loginpage","password is incorrect, please try with valid password", msg);
//	    		}
//	    	}else{
//	    		new ModelAndView("loginpage","email or password does not exist",msg);
//	    		
//	    }
//		return mvn;
//		
//	}
	
	
