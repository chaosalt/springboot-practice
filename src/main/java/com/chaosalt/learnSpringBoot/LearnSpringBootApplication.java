package com.chaosalt.learnSpringBoot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;

@SpringBootApplication
@ServletComponentScan
@PropertySources(value = { @PropertySource(value = "classpath:my.properties", encoding = "utf-8"),
		@PropertySource(value = "classpath:my2.properties", encoding = "utf-8") })
public class LearnSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(LearnSpringBootApplication.class, args);
	}
}
