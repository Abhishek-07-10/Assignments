package com.university.universityManagement.servive;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.university.universityManagement.model.Student;

@Service
public class StudentService {

    static List<Student> studentsList = new ArrayList<>();
    static{
        studentsList.add(new Student(1, "Abhishek", "Chauhan", 24, "I.C"));
        studentsList.add(new Student(2, "Arun", "Menon", 23, "I.C"));
        studentsList.add(new Student(3, "Abhilash", "Tengli", 23, "Civil"));
    }

    public void addStudent(Student s) {
        studentsList.add(s);
    }

    public void updateStudent(int id, Student s) {
        Student newStudent = getByID(id);
        newStudent.setDepartment(s.getDepartment());
    }

    public void deleteStudents(int id) {
        Student s = getByID(id);
        studentsList.remove(s);
    }

    public List<Student> get() {
        return studentsList;
    }

    public Student getByID(int id) {
        return studentsList.stream().filter(t-> t.getStudentId()==id).findFirst().get();
    }
}
