package com.p1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import com.p1.service.StudentService;

@Controller
public class StudentController {
	
	private final StudentService service;
	
	
	
	public StudentController(StudentService service) {
		super();
		this.service = service;
	}



	@GetMapping
	public String getAllStudents() {
		
		service.getAllStudent();
		return "students";
	}

}
