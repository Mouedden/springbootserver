package com.training.gestiondestock;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.support.SpringBootServletInitializer;
import org.springframework.builder.SpringApplicationBuilder;

@SpringBootApplication
@RestController
public class DemoApplication extends SpringBootServletInitializer {

	@GetMapping("/hello")
	public String sayHello() {
		return "Hello nherdek";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
		return builder.sources(DemoApplication.class);
	}

}
