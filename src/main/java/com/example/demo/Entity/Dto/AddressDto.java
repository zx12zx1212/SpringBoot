package com.example.demo.Entity.Dto;

import io.swagger.annotations.ApiParam;
import lombok.Data;

@Data
public class AddressDto {

    @ApiParam(name = "郵遞區號")
    private String postalCode;

    @ApiParam(name = "縣市")
    private String county;

    @ApiParam(name = "行政區")
    private String area;

    @ApiParam(name = "地址")
    private String address;

}
