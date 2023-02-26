package com.week5.mappingTest.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.week5.mappingTest.model.Student;
import com.week5.mappingTest.repository.StudentRepo;

@Service
public class StudentService {

    @Autowired
    StudentRepo repo;

    public void addStudent(Student student) {
        String ID = UUID.randomUUID().toString();
        Student newStudent = new Student();
        newStudent.setID(ID);
        newStudent.setAddress(student.getAddress());
        newStudent.setAge(student.getAge());
        newStudent.setBranch(student.getBranch());
        newStudent.setDepartment(student.getDepartment());
        newStudent.setName(student.getName());
        newStudent.setPhoneNumber(student.getPhoneNumber());
        repo.save(newStudent);
    }

    public Student getStudentById(String id) {
        return repo.findById(id).get();
    }

    public List<Student> getAllStudent() {
        return repo.findAll();
    }

    public String deleteStudentById(String id) {
        repo.deleteById(id);
        return "Dleted Student having ID: " + id;
    }

    public String updateStudent(Student student , String id){
        if(repo.findById(id).isPresent()){
            Student newStud = getStudentById(id);
            // newStud.setID(student.getID());
            newStud.setAddress(student.getAddress());
            newStud.setAge(student.getAge());
            newStud.setBranch(student.getBranch());
            newStud.setDepartment(student.getDepartment());
            newStud.setName(student.getName());
            newStud.setPhoneNumber(student.getPhoneNumber());
            repo.save(newStud);
            return "Update successfully";
        }
        return "Id not found in database";
    }

}
