package com.example.lhh.service;

import com.example.lhh.dao.Student;
import com.example.lhh.dao.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student getStudentById(long id){
        return null;
    }
}
