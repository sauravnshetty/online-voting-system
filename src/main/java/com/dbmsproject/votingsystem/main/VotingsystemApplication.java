package com.dbmsproject.votingsystem.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = {"com.dbmsproject.votingsystem.controller"})
public class VotingsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(VotingsystemApplication.class, args);
	}

}
