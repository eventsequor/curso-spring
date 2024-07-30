package com.eventsequor.mvc;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;


@Controller
@RequestMapping("/secondary")
public class DeleteController {
	@RequestMapping("/otherProcessForm")
	public String otherProcessForm(@RequestParam("nameStudent") String name, Model model) {

		
		name += " is the worse student";
		
		String finalMessage = String.format("Who is the best student? %s", name);
		
		// Adding information to model
		model.addAttribute("idMessage", finalMessage);
		
		return "studentAnswer2";
	}
	
	@RequestMapping("/showForm")
	public String showForm() {
		return "studentsForm";
	}
}
