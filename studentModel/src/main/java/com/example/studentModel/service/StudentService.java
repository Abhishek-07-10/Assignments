package com.example.studentModel.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.studentModel.dao.StudentRepository;
import com.example.studentModel.model.Student;

@Service
public class StudentService {
    
    @Autowired
    StudentRepository repo;

    public List<Student> getAllStudent() {
        return repo.findAll();
    }

    public void addStudents(Student entity) {
        long millis = System.currentTimeMillis();
        java.sql.Date date = new java.sql.Date(millis);
        System.out.println(date);
        Student s = new Student();
        s.setActive(entity.getActive());
        s.setAdmissionDate(date);
        s.setAge(entity.getAge());
        s.setFirstName(entity.getFirstName());
        s.setLastName(entity.getLastName());
        repo.save(s);
    }

    // public List<Student> getStudentsByActive(boolean active){
    //     return repo.findStudentsByActive(active);
    // }

    public List<Student> getStudentsByIsActive(boolean active) {
        return repo.findStudentsByActive(active);
    }

    public List<Student> getStudentsByFirstName(String firstName) {
        return repo.findStudentsByFirstname(firstName);
    }

    public List<Student> getStudentsByLastName(String lastName) {
        return repo.findStudentsByLastName(lastName);
    }

    public List<Student> getStudentsByAge(Integer age) {
        return repo.findStudentsByAge(age);
    }
}
