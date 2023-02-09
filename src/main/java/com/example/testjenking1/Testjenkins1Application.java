package com.example.testjenking1;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Testjenkins1Application implements CommandLineRunner {

	public static final Logger logger = LoggerFactory.getLogger(Testjenkins1Application.class);
	public static void main(String[] args) {
		logger.info("It is continuous integration job");
		SpringApplication.run(Testjenkins1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("This is second logger");
	}
}
