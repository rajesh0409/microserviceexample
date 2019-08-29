package com.example.jpa.one.to.many;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class OneToManyExample {
public static void main(String[] args) {
	SpringApplication.run(OneToManyExample.class,args);
}
}
