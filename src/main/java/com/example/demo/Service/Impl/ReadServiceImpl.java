package com.example.demo.Service.Impl;

import com.example.demo.Entity.School;
import com.example.demo.Repository.SchoolRepository;
import com.example.demo.Service.ReadService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReadServiceImpl implements ReadService {

    @Autowired
    SchoolRepository schoolRepository;

    public List<School> readAll() {
        return schoolRepository.findAll();
    }

}
