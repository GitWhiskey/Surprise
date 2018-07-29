package ru.mk.surprise;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.PropertySource;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories
@PropertySource("classpath:application.properties")
public class SurpriseApplication {

	public static void main(String[] args) {
		SpringApplication.run(SurpriseApplication.class, args);
	}
}
