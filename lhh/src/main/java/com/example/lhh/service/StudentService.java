package com.example.lhh.service;

import com.example.lhh.dao.Student;
import com.example.lhh.dto.StudentDTO;

public interface StudentService {

    StudentDTO getStudentById(long id);
}
