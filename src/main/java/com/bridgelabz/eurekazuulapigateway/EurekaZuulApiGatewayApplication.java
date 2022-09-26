package com.bridgelabz.eurekazuulapigateway;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableDiscoveryClient
@EnableZuulProxy
public class EurekaZuulApiGatewayApplication {

	public static void main(String[] args) {
		SpringApplication.run(EurekaZuulApiGatewayApplication.class, args);
	}
}
