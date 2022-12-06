package com.hackathon.dataprocess;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class DataprocessApplication {

	public static void main(String[] args) {
		SpringApplication.run(DataprocessApplication.class, args);
	}

}
