package com.example.sathishcoding.SpringBootJenkinsIntegration;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBootJenkinsIntegrationApplication implements CommandLineRunner {
	
	public static final Logger logger = LoggerFactory.getLogger(SpringBootJenkinsIntegrationApplication.class);

	public static void main(String[] args) {
		logger.info("Its a continuous integration job");
		SpringApplication.run(SpringBootJenkinsIntegrationApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		// TODO Auto-generated method stub
		logger.info("Its my second logger");
		logger.info("Hello Lalitha");
		logger.info("Sreenivasa Reddy dwarampudi");
		
	}
}
