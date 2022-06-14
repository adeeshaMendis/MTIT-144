package com.mtit.customerservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@EnableWebMvc
@EnableDiscoveryClient
@SpringBootApplication
public class EcommerceAppApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceAppApplication.class, args);
    }

}
