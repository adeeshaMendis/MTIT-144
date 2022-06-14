package com.mtit.retailcustomerserviceregistry;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class RetailCustomerServiceRegistryApplication {

    public static void main(String[] args) {
        SpringApplication.run(RetailCustomerServiceRegistryApplication.class, args);
    }

}
