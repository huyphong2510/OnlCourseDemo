package com.example.demo.controller;

import com.example.demo.dto.OnlineDTO;
import com.example.demo.service.OnlineService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/onlines")
public class OnlineController {

    @Autowired
    private OnlineService  onlineService;

    @PostMapping
    public void create(@RequestBody OnlineDTO dto) {
        onlineService.create(dto);
    }

    @GetMapping
    public List<OnlineDTO> findAll() {
        return onlineService.findAll();
    }
}
