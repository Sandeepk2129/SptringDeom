package com.luv2code.springdemo.mvc;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {
	
	@Value("#{countryOptions}")
	private Map<String, String> countryOptions;
	
	@RequestMapping("/showForm")
	public String showForm(Model theModel){
		
		//Create new student object 
		Student theStudent = new Student();
		
		//Add object to Model as attribute
		theModel.addAttribute("student", theStudent);
		
		//Add countries in the Model
		theModel.addAttribute("theCountryOptions", countryOptions);
		
		return "student-form";
	}
	
	@RequestMapping("/processForm")
	public String processForm(@ModelAttribute("student") Student theStudent){
		//Add countries in the Model
		System.out.println("The Student "+theStudent.getFirstName()+" "+ theStudent.getLastName()+" "+theStudent.getCountry());
		return "student-confirmation";
		
	}

}
