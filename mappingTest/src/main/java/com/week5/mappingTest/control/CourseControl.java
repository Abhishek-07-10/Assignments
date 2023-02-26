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

import com.week5.mappingTest.model.Course;
import com.week5.mappingTest.service.CourseService;

@RestController
@RequestMapping("/course")
public class CourseControl {
 
    @Autowired
    CourseService service;
    
    @PostMapping("/addCourse")
    public void addCourse(@RequestBody Course course){
        service.addCourse(course);
    }

    @DeleteMapping("/delete/course/{id}")
    public String deleteCourseById(@PathVariable String id){
        return service.deleteCourseById(id);
    }

    @GetMapping("/getCourse")
    public List<Course> getAllCourse(){
        return service.getAllCourse();
    }

    @GetMapping("/getCourse/{id}")
    public Course getCourseById(@PathVariable String id){
        return service.getCourseById(id);
    }

    @PutMapping("/update/course/{id}")
    public String updateCourse(@RequestBody Course course, @PathVariable String id){
        return service.updateCourse(course, id);
    }
}
