package com.example.lhh.converter;

import com.example.lhh.dao.Student;
import com.example.lhh.dto.StudentDTO;

public class StudentConverter {

    public static StudentDTO convertStudent(Student student) {
        return new StudentDTO(student.getId(), student.getName(), student.getEmail(), student.getAge());
    }
}
