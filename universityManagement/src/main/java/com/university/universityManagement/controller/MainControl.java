package com.university.universityManagement.controller;

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

import com.university.universityManagement.model.Student;
import com.university.universityManagement.model.University;
import com.university.universityManagement.servive.EventService;
import com.university.universityManagement.servive.StudentService;

@RestController
@RequestMapping("/universitiy-management")
public class MainControl {
    
    @Autowired
    StudentService students;
    
    @Autowired
    EventService university;

    @PostMapping("/addStudent")
    public void addStudent(@RequestBody Student s){
        students.addStudent(s);
    }

    @PutMapping("/update/id/{id}")
    public void updateStudent(@RequestBody Student s, @PathVariable int id){
        students.updateStudent(id, s);
    }

    @DeleteMapping("/delete/id/{id}")
    public void deleteStudents(@PathVariable int id){
        students.deleteStudents(id);
    }

    @GetMapping("/getStudent")
    public List<Student> getAllStudents(){
        return students.get();
    }

    @GetMapping("/getStudent/id/{id}")
    public Student getStudentbyID(@PathVariable int id){
        return students.getByID(id);
    }

    @PostMapping("/addevent")
    public void addEvent(@RequestBody University u){
        university.addEvent(u);
    }

    @PutMapping("/update/eventId/{id}")
    public void updateEvent(@PathVariable int id, @RequestBody University u){
        university.updateEvent(id, u);
    }

    @DeleteMapping("/delete/event-id/{id}")
    public void deleteEvent(@PathVariable int id){
        university.deleteEvent(id);
    }

    @GetMapping("/getallevents")
    public List<University> getEvent(){
        return university.getEvent();
    }

    @GetMapping("/geteventbydate/date/{date}")
    public List<University> getEventByDate(@PathVariable String date){
        return university.getEventByDate(date);
    }
}


    
