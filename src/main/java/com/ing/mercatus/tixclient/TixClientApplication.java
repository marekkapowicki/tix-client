package com.ing.mercatus.tixclient;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class TixClientApplication {

	public static void main(String[] args) {
		SpringApplication.run(TixClientApplication.class, args);
	}
}
