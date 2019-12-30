package com.wdk.nideshop;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableDiscoveryClient
@EnableTransactionManagement
@MapperScan("com.wdk.nideshop.dao")
public class NideshopServerApplication {

	public static void main(String[] args) {
		SpringApplication.run(NideshopServerApplication.class, args);
	}
}
