package com.profile.app;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.web.SpringServletContainerInitializer;

@SpringBootApplication
@EntityScan(basePackages = "com.profile.*")
@EnableJpaRepositories(basePackages = "com.profile.*")
@ComponentScan(basePackages = "com.profile.*")
public class UserProfileApplication extends SpringServletContainerInitializer{

	public static void main(String[] args) {
		SpringApplication.run(UserProfileApplication.class, args);
	}

}
