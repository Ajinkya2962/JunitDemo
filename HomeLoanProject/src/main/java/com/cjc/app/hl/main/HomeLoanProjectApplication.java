package com.cjc.app.hl.main;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import com.cjc.app.hl.main.model.CustomerDetails;

@SpringBootApplication
@EnableJpaRepositories
@EntityScan
public class HomeLoanProjectApplication {

	public static void main(String[] args) {
		SpringApplication.run(HomeLoanProjectApplication.class, args);
		System.out.println("Start...");
	
	}
	
}
