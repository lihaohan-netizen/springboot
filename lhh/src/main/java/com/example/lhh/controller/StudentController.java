package com.example.lhh.controller;

import com.example.lhh.dao.Student;
import com.example.lhh.dto.StudentDTO;
import com.example.lhh.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private StudentService studentService;

    @GetMapping("/student/{id}")
    public StudentDTO getStudentById(@PathVariable long id){
        return studentService.getStudentById(id);
    }
}
