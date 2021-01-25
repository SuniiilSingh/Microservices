package com.sun.product;

import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;


@SpringBootApplication
public class ProductManagementApp {

	public static void main(String[] args) {
		SpringApplication.run(ProductManagementApp.class, args);
	}
	@Bean
	public ModelMapper modelMapper() {
		return new ModelMapper();
	}


}
