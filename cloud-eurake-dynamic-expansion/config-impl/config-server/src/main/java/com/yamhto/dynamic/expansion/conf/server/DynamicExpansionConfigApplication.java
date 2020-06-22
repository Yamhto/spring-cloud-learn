package com.yamhto.dynamic.expansion.conf.server;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class DynamicExpansionConfigApplication {

    public static void main(String[] args) {
        SpringApplication.run(DynamicExpansionConfigApplication.class, args);
    }
}
