package com.example.demo.Controller;

import com.example.demo.Entity.Dto.SchoolDto;
import com.example.demo.Service.ReadService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(value = "/api/read")
@Api(tags = "Read",description = "查詢學校功能")
public class ReadController {

    @Autowired
    ReadService readService;

    @Autowired
    ModelMapper modelMapper;

    @GetMapping
    @ApiOperation("查詢所有學校")
    List<SchoolDto> readAllSchools() {
        return readService.readAll()
                .stream()
                .map(e -> modelMapper.map(e, SchoolDto.class))
                .collect(Collectors.toList());
    }
}
