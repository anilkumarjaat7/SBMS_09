package com.p1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

import com.p1.model.Student;
import com.p1.service.StudentService;

@Controller
public class StudentController {
	
	
	private final StudentService service;

    public StudentController(StudentService service) {
        this.service = service;
    }
    
    
//    home Page
    @GetMapping("/")
    public String home() {
        return "index";
    }

//    Display Get All Student
    @GetMapping("/students")
    public String students(Model model) {
    	model.addAttribute("students", service.getAllStudent());
    	
    	return "students";
    }
    
    
    // Save Student
    @PostMapping("/students/save")
    public String saveStudent(@ModelAttribute Student student) {

        service.addStudent(student);

        return "redirect:/students";
    }
    
    
    // Student Details
    @GetMapping("/students/{id}")
    public String studentDetails(
            @PathVariable int id,
            Model model) {

        model.addAttribute(
            "student",
            service.getStudentById(id)
        );

        return "student-details";
    }
    
    
 // Edit Student Page
    @GetMapping("/students/edit/{id}")
    public String editStudent(@PathVariable int id, Model model) {

        Student student = service.getStudentById(id);

        if (student == null) {
            return "redirect:/students";
        }

        model.addAttribute("student", student);

        return "edit-student";
    }

    // Update Student
    @PostMapping("/students/update")
    public String updateStudent(@ModelAttribute Student student) {

        service.updateStudent(student);

        return "redirect:/students";
    }
    
      // Delete Student
    @GetMapping("/students/delete/{id}")
    public String deleteStudent(@PathVariable int id) {

        service.deleteStudent(id);

        return "redirect:/students";
    }

}
