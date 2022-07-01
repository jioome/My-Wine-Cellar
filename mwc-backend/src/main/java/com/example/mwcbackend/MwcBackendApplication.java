package com.example.mwcbackend;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@EnableJpaAuditing
@SpringBootApplication
public class MwcBackendApplication {

	public static void main(String[] args) {
		SpringApplication.run(MwcBackendApplication.class, args);
	}

}
