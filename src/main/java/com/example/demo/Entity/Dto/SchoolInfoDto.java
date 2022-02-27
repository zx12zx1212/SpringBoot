package com.example.demo.Entity.Dto;

import io.swagger.annotations.ApiParam;
import lombok.Data;

import javax.persistence.Column;

@Data
public class SchoolInfoDto {

    @ApiParam(name = "電話")
    private String tel;

    @ApiParam(name = "傳真")
    private String fax;

    @ApiParam(name = "網紙")
    private String web;

}
