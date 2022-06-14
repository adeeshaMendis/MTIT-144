package com.assignment.MTIT64.trackOrderservice.dto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

import java.util.Collections;

@Configuration
@EnableSwagger2
public class SwaggerConfig {

    @Bean
    public Docket swaggerApiConfig() {

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/trackOrders"))
                .apis(RequestHandlerSelectors.basePackage("com.assignment.MTIT64.trackOrderservice"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {

        return new ApiInfo(
                "Swagger API by Wijekoon V.U - IT18008524",
                "API reference for MTIT Assignment 4",
                "1.0.0",
                "Public API",
                new Contact(
                        "Wijekoon V.U - Y4S1",
                        "https://mvnrepository.com/artifact/io.springfox/springfox-swagger2/2.9.2",
                        "it18008524@my.sliit.lk"),
                "API Dashboard",
                "http://localhost:8093/swagger-ui.html#/",
                Collections.emptyList()
        );
    }
}
