package com.eventsequor.mvc;

import javax.validation.Valid;

import org.springframework.beans.propertyeditors.StringTrimmerEditor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.WebDataBinder;
import org.springframework.web.bind.annotation.InitBinder;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/student")
public class StudentController {

	@RequestMapping("/showForm")
	public String showForm(Model model) {
		Student student = new Student();
		model.addAttribute("theStudent", student);
		return "studentRegistrationForm";
	}

	@RequestMapping("/formProcessor")
	public String formProcessor(@Valid @ModelAttribute("theStudent") Student theStudent, BindingResult bindingResult) {

		if (bindingResult.hasErrors()) {
			return "studentRegistrationForm";
		}

		return "studentRegistrationConfirmation";
	}

	@InitBinder
	public void myBinder(WebDataBinder webDataBinder) {
		StringTrimmerEditor stringTrimmerEditor = new StringTrimmerEditor(true);
		webDataBinder.registerCustomEditor(String.class, stringTrimmerEditor);
	}
}
