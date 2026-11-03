package com.p1.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
// table create in data base 
@Entity
@Table(name="students")
public class Student {
//	primary Key 
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String email;
	private String course;
	private String fees;
	
	
	public Student() {
		super();
	}

	
	

	public Student(String name, String email, String course, String fees) {
		super();
		this.name = name;
		this.email = email;
		this.course = course;
		this.fees = fees;
	}




	public Student(Long id, String name, String email, String course, String fees) {
		super();
		this.id = id;
		this.name = name;
		this.email = email;
		this.course = course;
		this.fees = fees;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public String getEmail() {
		return email;
	}




	public void setEmail(String email) {
		this.email = email;
	}




	public String getCourse() {
		return course;
	}




	public void setCourse(String course) {
		this.course = course;
	}




	public String getFees() {
		return fees;
	}




	public void setFees(String fees) {
		this.fees = fees;
	}




	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", email=" + email + ", course=" + course + ", fees=" + fees
				+ "]";
	}
	
	
	
	
	

}
