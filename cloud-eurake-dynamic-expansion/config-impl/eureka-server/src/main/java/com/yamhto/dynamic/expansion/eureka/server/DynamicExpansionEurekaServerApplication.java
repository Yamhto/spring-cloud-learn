package com.yamhto.dynamic.expansion.eureka.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.util.Scanner;

@SpringBootApplication
@EnableEurekaServer
public class DynamicExpansionEurekaServerApplication {

    public static void main(String[] args) {

        SpringApplication.run(DynamicExpansionEurekaServerApplication.class, args);
//        Scanner scanner = new Scanner(System.in);
//
//        new SpringApplicationBuilder(DynamicExpansionEurekaServerApplication.class).profiles(scanner.nextLine()).run(args);
    }
}
