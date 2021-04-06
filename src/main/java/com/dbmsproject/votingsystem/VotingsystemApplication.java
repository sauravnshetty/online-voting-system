package com.dbmsproject.votingsystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication(scanBasePackages = {"com.dbmsproject.votingsystem.controller", "com.dbmsproject.votingsystem.service", 
		"com.dbmsproject.votingsystem.doa"}, exclude = { SecurityAutoConfiguration.class })
@ComponentScan(basePackages = {"com.dbmsproject.votingsystem.controller", "com.dbmsproject.votingsystem.service", 
		"com.dbmsproject.votingsystem.doa", "com.dbmsproject.votingsystem"})
public class VotingsystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(VotingsystemApplication.class, args);
	}

}
