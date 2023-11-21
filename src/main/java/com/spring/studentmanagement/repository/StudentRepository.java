package com.spring.studentmanagement.repository;

import com.spring.studentmanagement.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface StudentRepository extends JpaRepository<Student, Integer> {

    List<Student> findAll();
    Student findById(int id);

}


