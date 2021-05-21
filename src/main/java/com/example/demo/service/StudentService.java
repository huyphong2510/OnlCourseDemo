package com.example.demo.service;

import com.example.demo.dto.StudentDTO;

import java.util.List;
public interface StudentService {
    void create(StudentDTO dto);
    List<StudentDTO> findAll();

}