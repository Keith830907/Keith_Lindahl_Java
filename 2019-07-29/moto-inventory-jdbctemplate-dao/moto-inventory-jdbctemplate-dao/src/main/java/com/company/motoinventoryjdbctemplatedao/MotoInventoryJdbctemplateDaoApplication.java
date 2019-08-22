package com.company.motoinventoryjdbctemplatedao;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class MotoInventoryJdbctemplateDaoApplication {



	public static void main(String[] args) {

		SpringApplication.run(MotoInventoryJdbctemplateDaoApplication.class, args);
	}

}
