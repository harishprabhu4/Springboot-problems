package com.example.demo;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class RegistrationController {
	
	
	List<Studentdetails> ls = new ArrayList<>();
	
	@RequestMapping("/")
	public String Welcomepage() {
		return "index.html";
	}
		
		
		@RequestMapping("/register")
		public String register()
		{
			return "registrationform";
		}
		
		
		
		@RequestMapping("/success")
		public String Registration(Studentdetails stud) {
			
			
			ls.add(stud);	
			return "success";
			
		}
		
		@RequestMapping("/display")
		public String getStudents(Model m)
		{
			
			
			
			m.addAttribute("students",ls);
			
			return "Displaystudent";
			
		}
}


