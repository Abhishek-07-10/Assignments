package com.week5.mappingTest.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.week5.mappingTest.model.Student;
import com.week5.mappingTest.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentControl {
    @Autowired
    StudentService service;
    
    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student student){
        service.addStudent(student);
    }

    @DeleteMapping("/delete/student/{id}")
    public String deleteStudentById(@PathVariable String id){
        return service.deleteStudentById(id);
    }

    @GetMapping("/getStudent")
    public List<Student> getAllStudent(){
        return service.getAllStudent();
    }

    @GetMapping("/getStudent/{id}")
    public Student getStudentById(@PathVariable String id){
        return service.getStudentById(id);
    }

    @PutMapping("/update/student/{id}")
    public String updateStudent(@RequestBody Student student, @PathVariable String id){
        return service.updateStudent(student, id);
    }
}
