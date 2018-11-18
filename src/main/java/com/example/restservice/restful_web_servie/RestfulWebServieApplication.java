package com.example.restservice.restful_web_servie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.ComponentScans;

@SpringBootApplication
@ComponentScan(basePackages= {"userRestService"})
public class RestfulWebServieApplication {

	public static void main(String[] args) {
		SpringApplication.run(RestfulWebServieApplication.class, args);
	}
}
