package com.solstice.ecommerceeurekaservicediscovery;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class EcommerceEurekaServiceDiscoveryApplication
{

	public static void main(String[] args)
	{
		SpringApplication.run(EcommerceEurekaServiceDiscoveryApplication.class, args);
	}
}
