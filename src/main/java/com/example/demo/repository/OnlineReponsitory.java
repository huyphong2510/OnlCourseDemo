package com.example.demo.repository;

import com.example.demo.entity.Online;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OnlineReponsitory extends JpaRepository<Online, Long> {
}

