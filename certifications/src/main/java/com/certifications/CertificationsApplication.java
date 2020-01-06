package com.certifications;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//@EnableDiscoveryClient
public class CertificationsApplication {

	public static void main(String[] args) {
		SpringApplication.run(CertificationsApplication.class, args);
	}

}