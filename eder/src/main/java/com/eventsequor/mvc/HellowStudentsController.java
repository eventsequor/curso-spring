package com.eventsequor.mvc;

import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class HellowStudentsController {

	@RequestMapping("/showForm")
	public String showForm() {
		return "studentsForm";
	}

	@RequestMapping("/processForm")
	public String processForm() {
		return "studentAnswer";
	}

	@RequestMapping("/otherProcessForm2")
	public String otherProcessForm2(HttpServletRequest request, Model model) {

		
		String name = request.getParameter("nameStudent");
		name += " is the best student";
		
		String finalMessage = String.format("Who is the best student? %s", name);
		
		// Adding information to model
		model.addAttribute("idMessage", finalMessage);
		
		return "studentAnswer2";
	}
		
	// second way to make the things
	@RequestMapping("/otherProcessForm")
	public String otherProcessForm(@RequestParam("nameStudent") String name, Model model) {

		
		name += " is the best student";
		
		String finalMessage = String.format("Who is the best student? %s", name);
		
		// Adding information to model
		model.addAttribute("idMessage", finalMessage);
		
		return "studentAnswer2";
	}
	
	
}
