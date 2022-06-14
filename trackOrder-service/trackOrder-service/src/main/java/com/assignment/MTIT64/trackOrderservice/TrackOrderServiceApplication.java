package com.assignment.MTIT64.trackOrderservice;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
public class TrackOrderServiceApplication {

	public static void main(String[] args) {
		SpringApplication.run(TrackOrderServiceApplication.class, args);
	}

}
