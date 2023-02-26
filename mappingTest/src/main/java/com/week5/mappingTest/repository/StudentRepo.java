package com.week5.mappingTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.week5.mappingTest.model.Student;


public interface StudentRepo extends JpaRepository<Student, String> {
    
}
