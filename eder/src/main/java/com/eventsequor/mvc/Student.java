package com.eventsequor.mvc;

import javax.validation.constraints.Email;
import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

public class Student {

	@NotNull
	@Size(min = 2, message = "Mandatory field, or at least with two characters")
	private String name;
	
	private String lastName;
	private String elective;
	private String studiestCity;
	private String language;
	
	@Min(value = 10, message = "Ages under 10 years old are not allowed.")
	@Max(value = 70, message = "Age over 70 year old are not allowed")
	private int age;
	
	@NotNull
	@Email(message = "The email was not written correctly")
	private String email;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getElective() {
		return elective;
	}

	public void setElective(String elective) {
		this.elective = elective;
	}

	public String getStudiestCity() {
		return studiestCity;
	}

	public void setStudiestCity(String studiestCity) {
		this.studiestCity = studiestCity;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language.replace(",", ", ");
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
