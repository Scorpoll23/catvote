package com.example.catvote;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;


@SpringBootApplication
@EntityScan("com.example.catvote.model")
@EnableJpaRepositories(basePackages = "com.example.catvote")
public class CatvoteApplication {


	public static void main(String[] args) {
		SpringApplication.run(CatvoteApplication.class, args);
		
	}
}
