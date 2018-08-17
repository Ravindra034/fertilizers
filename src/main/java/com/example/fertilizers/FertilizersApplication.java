package com.example.fertilizers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class FertilizersApplication extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(FertilizersApplication.class, args);
	}

	@Override
	public SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(FertilizersApplication.class);
	}
}
