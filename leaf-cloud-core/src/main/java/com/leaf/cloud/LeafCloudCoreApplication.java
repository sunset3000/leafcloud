package com.leaf.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class LeafCloudCoreApplication {

	public static void main(String[] args) {
		SpringApplication.run(LeafCloudCoreApplication.class, args);
	}
}
