package com.sum.alumno;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@EnableEurekaClient
@SpringBootApplication
public class MsAlumnoApplication {

	public static void main(String[] args) {
		SpringApplication.run(MsAlumnoApplication.class, args);
	}

}
