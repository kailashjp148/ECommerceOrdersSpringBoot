package com.kailash.ecommerceorders;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class EcommerceordersApplication {

	public static void main(String[] args) {
		SpringApplication.run(EcommerceordersApplication.class, args);
	}

}
