package com.assignment.MTIT144.paymentservice.dto;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

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
@EnableWebMvc
public class SwaggerConfig {

    @Bean
    public Docket swaggerApiConfig() {

        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                .paths(PathSelectors.ant("/payment"))
                .apis(RequestHandlerSelectors.basePackage("com.assignment.MTIT144.paymentservice"))
                .build()
                .apiInfo(apiInfo());
    }

    private ApiInfo apiInfo() {

        return new ApiInfo(
                "Swagger API by Member 2 - ITxxxxxxx",
                "API reference for MTIT Assignment 4",
                "1.0.0",
                "Public API",
                new Contact(
                        "Member 2",
                        "https://mvnrepository.com/artifact/io.springfox/springfox-swagger2/2.9.2",
                        "itxxxxxx@my.sliit.lk"),
                "API Dashboard",
                "http://localhost:9181/swagger-ui.html#/",
                Collections.emptyList()
        );
    }
}
