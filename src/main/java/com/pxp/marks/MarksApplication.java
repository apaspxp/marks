package com.pxp.marks;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class MarksApplication {

	public static void main(String[] args) {
		SpringApplication.run(MarksApplication.class, args);
	}

}
