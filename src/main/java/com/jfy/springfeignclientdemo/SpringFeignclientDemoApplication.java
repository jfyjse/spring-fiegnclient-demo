package com.jfy.springfeignclientdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class SpringFeignclientDemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringFeignclientDemoApplication.class, args);
	}

}
