package com.example.demo.service;

import com.example.demo.dto.StudentDTO;
import com.example.demo.entity.Student;
import com.example.demo.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;
@Service
public class StudentServiceImpl implements StudentService {
    @Autowired
    private StudentRepository studentRepository;

    @Override
    public void create(StudentDTO dto) {
        Student student = new Student();
        student.setAddress(dto.getAddress());
        student.setFull_name(dto.getFull_name());
        student.setBirthday(dto.getBirthday());
        studentRepository.save(student);
    }
    @Override
    public List<StudentDTO> findAll() {
        return studentRepository.findAll().stream()
                .map(student -> {
                    StudentDTO studentDTO = new StudentDTO();
                    studentDTO.setAddress(student.getAddress());
                    studentDTO.setFull_name(student.getFull_name());
                    studentDTO.setBirthday(student.getBirthday());
                    studentDTO.setId(student.getId());


                    return  studentDTO;
                }).collect(Collectors.toList());
    }
}