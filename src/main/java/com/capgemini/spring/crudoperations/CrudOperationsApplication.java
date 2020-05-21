package com.capgemini.spring.crudoperations;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class CrudOperationsApplication extends SpringBootServletInitializer{

	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(CrudOperationsApplication.class);
	}
	
	
	public static void main(String[] args) throws Exception {
		SpringApplication.run(CrudOperationsApplication.class, args);
	}
	
	

}
