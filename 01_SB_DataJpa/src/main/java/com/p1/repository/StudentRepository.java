package com.p1.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import com.p1.entity.Student;

public interface StudentRepository extends CrudRepository<Student, Long>{

}
