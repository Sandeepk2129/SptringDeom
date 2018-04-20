package com.luv2code.springdemo.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HelloWorldController {
	
	//Controller method to display initial HTML form
	
	@RequestMapping("/showForm")
	public String showForm(){
		return "helloWorld-form";
	}
	//Controller Method to Process the HTML form
	
	@RequestMapping("/processForm")
	public String processForm(){
		return "helloworld";
	}
	
	//Controller to add data to model object
	
	@RequestMapping("/processFormVersionTwo")
	public String letsShout(HttpServletRequest request, Model model){
		//Read Request parameter from form
		
		String theName = request.getParameter("studentName");
		
		//Convert name to upper case
		
		theName.toUpperCase();
		
		String result = "Yo!! " + theName;
		//Add name to model object
		
		model.addAttribute("message", result);
		
		
		
		return "helloworld";
		
	}
	
	@RequestMapping("/processFormVersionThree")
	public String processFormThree(@RequestParam("studentName")String theName, Model model){
		
		
		//Convert name to upper case
		
		theName.toUpperCase();
		
		String result = "Hello Friend " + theName;
		//Add name to model object
		
		model.addAttribute("message", result);
		
		
		
		return "helloworld";
		
	}
}
