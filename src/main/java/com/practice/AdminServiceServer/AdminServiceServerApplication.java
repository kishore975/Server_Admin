package com.practice.AdminServiceServer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import de.codecentric.boot.admin.server.config.EnableAdminServer;

@SpringBootApplication
@EnableAdminServer
public class AdminServiceServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(AdminServiceServerApplication.class, args);
	}

}
