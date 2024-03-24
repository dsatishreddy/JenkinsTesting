package com.example.sathishcoding.SpringBootJenkinsIntegration;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class SpringBootJenkinsIntegrationApplicationTests {
	
	public static final Logger logger = LoggerFactory.getLogger(SpringBootJenkinsIntegrationApplicationTests.class);

	@Test
	void contextLoads() {
		logger.info("It is my test class");
		assertEquals(true, true);
	}

}
