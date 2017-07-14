package com.TaurusSolution.RRHH;

import com.TaurusSolution.Controllers.MainController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableAutoConfiguration
@ComponentScan(basePackages = "com.TaurusSolution")
@EntityScan("com.TaurusSolution")
public class RrhhApplication {

	public static void main(String[] args) {

		SpringApplication.run(RrhhApplication.class, args);
	}
}
