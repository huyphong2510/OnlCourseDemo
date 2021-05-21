package com.example.demo.controller;

import com.example.demo.dto.StudentDTO;
import com.example.demo.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;
@RestController
@RequestMapping("/students")
public class StudentController {
    @Autowired
    private StudentService studentService;
    @PostMapping
    public void create(@RequestBody StudentDTO dto) {
        studentService.create(dto);
    }
    @GetMapping
    public List<StudentDTO> findAll() {
        return studentService.findAll();
    }

}
