package com.example.demo.service;

import com.example.demo.dto.OnlineDTO;
import com.example.demo.entity.Online;
import com.example.demo.repository.OnlineReponsitory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import java.util.List;
import java.util.stream.Collectors;

@Service
public class OnlineServiceImpl implements OnlineService {

    @Autowired
    private OnlineReponsitory onlineRepository;

    @Override
    public  void create(OnlineDTO dto) {
        Online online = new Online();
        online.setAuthor(dto.getAuthor());
        online.setFull_name(dto.getFull_name());
        online.setPrice(dto.getPrice());
        onlineRepository.save(online);
    }

    @Override
    public List<OnlineDTO> findAll() {
        return onlineRepository.findAll().stream()
                .map(online -> {
                    OnlineDTO onlineDTO = new OnlineDTO();
                    onlineDTO.setAuthor(online.getAuthor());
                    onlineDTO.setId(online.getId());
                    onlineDTO.setFull_name(online.getFull_name());
                    onlineDTO.setPrice(online.getPrice());
                    return  onlineDTO;
                }).collect(Collectors.toList());
    }
}

