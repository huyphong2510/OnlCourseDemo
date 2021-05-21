package com.example.demo.service;

import com.example.demo.dto.OnlineDTO;


import java.util.List;

public interface OnlineService {

    void create(OnlineDTO dto);

    List<OnlineDTO> findAll();
}
