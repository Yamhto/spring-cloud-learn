package com.yamhto.cloud.openfeign.consumer;

import com.yanhto.cloud.config.center.feign.GolbalFeignConfig;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @author yamhto
 * @className: OpenFeignConsumerApplication.java
 * @package com.yamhto.cloud.openfeign.consumer
 * @description:
 * @date 2020/3/10 14:16
 */
@SpringBootApplication
@EnableFeignClients(defaultConfiguration = GolbalFeignConfig.class)
@EnableHystrix
@EnableCircuitBreaker
@EnableEurekaClient
public class OpenFeignConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(OpenFeignConsumerApplication.class, args);
    }
}
