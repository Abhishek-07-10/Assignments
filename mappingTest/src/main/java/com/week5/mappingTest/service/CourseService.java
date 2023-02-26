package com.week5.mappingTest.service;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.week5.mappingTest.model.Course;
import com.week5.mappingTest.repository.CourseRepo;

@Service
public class CourseService {

    @Autowired 
    CourseRepo repo;

    public void addCourse(Course course) {  

        String Id = UUID.randomUUID().toString();
        Course newCourse = new Course();
        newCourse.setID(Id);
        newCourse.setDescription(course.getDescription());
        newCourse.setDuration(course.getDuration());
        newCourse.setTitle(course.getTitle());
        repo.save(newCourse);
    }

    public String deleteCourseById(String id) {
        repo.deleteById(id);
        return "Delete course having ID: "+id;
    }

    public List<Course> getAllCourse() {
        return repo.findAll();
    }

    public Course getCourseById(String id) {
        return repo.findById(id).get();
    }

    public String updateCourse(Course course, String id) {
        if(repo.findById(id).isPresent()){
            Course newCourse = repo.findById(id).get();
            newCourse.setDescription(course.getDescription());
            newCourse.setDuration(course.getDuration());
            newCourse.setStudentList(course.getStudentList());
            newCourse.setTitle(course.getTitle());
            repo.save(newCourse);
            return "Updated Successfully";
        }
        return "ID not found in database";
    }
    
}
