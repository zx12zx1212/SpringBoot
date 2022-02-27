package com.example.demo.Entity.Dto;

import io.swagger.annotations.ApiParam;
import lombok.Data;

@Data
public class SchoolDto {

    @ApiParam(name = "學校代碼")
    private String Id;

    @ApiParam(name = "學校中文名")
    private String zhName;

    @ApiParam(name = "學校英文名")
    private String enName;

    @ApiParam(name = "學校地址")
    private AddressDto address;

    @ApiParam(name = "學校其他資訊")
    private SchoolInfoDto schoolInof;

}
