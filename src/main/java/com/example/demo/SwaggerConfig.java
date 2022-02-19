package com.example.demo;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.oas.annotations.EnableOpenApi;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;

@EnableWebMvc
@EnableOpenApi
@Configuration
public class SwaggerConfig {
    public class App {
        @Bean
        public Docket createRestApi() {
            return new Docket(DocumentationType.OAS_30)                                                     // 設置使用 OpenApi 3.0 規範
                    .enable(true)                                                                           // 是否開啟 Swagger
                    .apiInfo(apiInfo())                                                                     // 配置項目基本訊息基本
                    //.groupName("xxx组")                                                                     // 设置项目组名
                    .select()                                                                               // 選擇路径和 api 生成 document
                    .apis(RequestHandlerSelectors.any())                                                    // 對所有 api 進行監控
                    //.apis(RequestHandlerSelectors.basePackage("mydlq.swagger.example.controller"))          // 如果需要指定對某個包的接口進行監控，則可以配置如下
                    .paths(PathSelectors.any())                                                             // 對所有路徑進行監控
                    .paths(PathSelectors.regex("/error.*").negate())                              // 忽略以 "/error" 開頭的路径,可以防止顯示如 404 錯誤接口
                    .paths(PathSelectors.regex("/actuator.*").negate())                           // 忽略以 "/actuator" 開頭的路径
                    .build();
        }

        private ApiInfo apiInfo() {
            return new ApiInfoBuilder()
                    .title("大專院校作業系統")                                                                 // 標題
                    .description("大專院校作業系統")                                                           // 描述
                    .version("0.0.1")                                                                       // 版本
                    .license("Apache LICENSE 2.0")                                                          // 許可聲明訊息
                    .licenseUrl("https://github")                                                           // 許可證 URL 地址
                    .contact(new Contact("LONG", "http://www.mydlq.club", "xxx@gmail.com")) // 管理該 API 人員的關聯信息
                    .build();
        }
    }
}
