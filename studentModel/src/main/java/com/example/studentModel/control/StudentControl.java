package com.example.studentModel.control;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.studentModel.model.Student;
import com.example.studentModel.service.StudentService;

@RestController
@RequestMapping("/student")
public class StudentControl {

    @Autowired
    StudentService service;

    @PostMapping(value = "/add-students")
    public ResponseEntity<String> postMethodName(@RequestBody Student entity) {
        service.addStudents(entity);
        return new ResponseEntity<String>("Student Saved", HttpStatus.OK);
    }

    @GetMapping("/get-all-students")
    public ResponseEntity<List<Student>> getStudents() {
        List<Student> list = service.getAllStudent();
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/get-students-byFirstName/{firstName}")
    public ResponseEntity<List<Student>> getStudentsByFirstName(@PathVariable String firstName) {
        List<Student> list = service.getStudentsByFirstName(firstName);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/get-students-byLastName/{lastName}")
    public ResponseEntity<List<Student>> getStudentsByLastName(@PathVariable String lastName) {
        List<Student> list = service.getStudentsByLastName(lastName);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/get-students-byAge/{age}")
    public ResponseEntity<List<Student>> getStudentsByAge(@PathVariable Integer age) {
        List<Student> list = service.getStudentsByAge(age);
        return new ResponseEntity<>(list, HttpStatus.OK);
    }

    @GetMapping("/get-students-byActive/{active}")
    public ResponseEntity<List<Student>> getStudentsByActive(@PathVariable boolean active) {
        List<Student> list = service.getStudentsByIsActive(active);
        return new ResponseEntity<>(list, HttpStatus.OK);
    } 
}
