package com.talyson.APIRest_Oracle;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@SpringBootApplication
@EnableJpaRepositories("com.talyson.*")
@ComponentScan(basePackages = { "com.talyson.*" })
@EntityScan("com.talyson.*") 
public class ApiRestOracleApplication {

	public static void main(String[] args) {
		SpringApplication.run(ApiRestOracleApplication.class, args);
	}

}
