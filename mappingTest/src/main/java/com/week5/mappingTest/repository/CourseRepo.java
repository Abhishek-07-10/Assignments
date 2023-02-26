package com.week5.mappingTest.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.week5.mappingTest.model.Course;

public interface CourseRepo extends JpaRepository<Course, String> {
    
}
