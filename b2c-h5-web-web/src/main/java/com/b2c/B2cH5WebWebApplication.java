package com.b2c;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.feign.EnableFeignClients;

@SpringBootApplication
@EnableEurekaClient
@EnableFeignClients
public class B2cH5WebWebApplication {

	public static void main(String[] args) {

		SpringApplication.run(B2cH5WebWebApplication.class, args);
	}
}
