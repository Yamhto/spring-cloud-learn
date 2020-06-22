package com.yamhto.dynamic.expansion.eureka.client;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.util.Scanner;

@SpringBootApplication
@EnableDiscoveryClient
public class DynamicExpansionEurekaClientApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicExpansionEurekaClientApplication.class, args);
    }
}

