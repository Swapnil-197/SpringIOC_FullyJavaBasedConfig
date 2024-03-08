package com.beans;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentConfig {
	
	@Bean
	public Student student() { // here student is name of bean which we will use in TestApp class
		return new Student();
	}

	@Bean
	public Address address() {
		return new Address();
	}
}
