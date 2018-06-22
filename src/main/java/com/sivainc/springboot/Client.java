package com.sivainc.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.sivainc"})
public class Client {

	public static void main(String[] args) {
		SpringApplication.run(Client.class, args);
	}
}
