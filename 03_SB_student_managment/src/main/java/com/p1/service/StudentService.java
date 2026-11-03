package com.p1.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.p1.model.Student;

@Service
public class StudentService {
	
//	data Base
    private List<Student> students = new ArrayList<>();

    public StudentService() {

        students.add(new Student(
            1, "Anil", "anil@gmail.com", "Java", "Delhi"
        ));

        students.add(new Student(
            2, "Rahul", "rahul@gmail.com", "Python", "Noida"
        ));

        students.add(new Student(
            3, "Amit", "amit@gmail.com", "MERN", "Gurgaon"
        ));
    }

    
    public List<Student> getAllStudent(){
    	return students;
    }
	
    public Student getStudentById(int id) {
    	return students.stream().filter(s -> s.getId() == id).findFirst().orElse(null);
    }
    
    public void addStudent(Student student) {
    	student.setId(students.size() + 1);
    	students.add(student);
    }
    
    public void deleteStudent(int id) {
    	students.remove(id);
    }
    
    public void updateStudent(Student updatedStudent) {

        for (int i = 0; i < students.size(); i++) {

            if (students.get(i).getId() == updatedStudent.getId()) {

                students.set(i, updatedStudent);

                return;
            }
        }
    }

}
