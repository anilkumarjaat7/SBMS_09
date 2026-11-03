package com.p1.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.p1.entity.Student;
import com.p1.repository.StudentRepository;

@Service
public class StudentService {
	

	private final StudentRepository repo;

	public StudentService(StudentRepository repo) {
		super();
		this.repo = repo;
	}
	
	public List<Student> getAllStudent() {
		return  (List<Student>) repo.findAll();
	}

}
