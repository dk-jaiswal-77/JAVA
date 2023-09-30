package com.dj.restapidemo.rest;

import com.dj.restapidemo.entity.Student;
import jakarta.annotation.PostConstruct;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api")
public class StudentRestController {
    private List<Student> theStudents;
    // define @PostConstruct to load student data...only once!
    @PostConstruct
    public void loadData() {
        theStudents = new ArrayList<>();
        theStudents.add(new Student("Shubham", "Jaiswal"));
        theStudents.add(new Student("Soham", "Jaiswal"));
    }

    // define endpoint for "/students" - returns list of students
    @GetMapping("/students")
    public List<Student> getStudents() {
        return this.theStudents;
    }

    // define endpoints "/students/{studentId}" - return student at index
    @GetMapping("/students/{studentId}")
    public Student getStudentById(@PathVariable int studentId) {
        if ((studentId >= theStudents.size()) || (studentId < 0)) {
            throw new StudentNotFoundException("Student ID not found - " + studentId);
        }
        return theStudents.get(studentId);
    }
}
