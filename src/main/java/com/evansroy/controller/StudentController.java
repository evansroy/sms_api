package com.evansroy.controller;

import com.evansroy.model.Student;
import com.evansroy.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/v1/")
public class StudentController {
    @Autowired
    private StudentRepository studentRepository;

    //get all students
    @GetMapping("students")
    public List<Student> getAllStudents(){
        return studentRepository.findAll();
    }
}
