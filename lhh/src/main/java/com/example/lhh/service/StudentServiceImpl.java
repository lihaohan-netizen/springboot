package com.example.lhh.service;

import com.example.lhh.converter.StudentConverter;
import com.example.lhh.dao.Student;
import com.example.lhh.dao.StudentRepository;
import com.example.lhh.dto.StudentDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public StudentDTO getStudentById(long id){

        Student student = studentRepository.findById(id).orElseThrow(RuntimeException::new);
        return StudentConverter.convertStudent(student);
    }
}
