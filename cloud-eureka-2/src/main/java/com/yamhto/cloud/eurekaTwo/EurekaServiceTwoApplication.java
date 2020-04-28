package com.yamhto.cloud.eurekaTwo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yamhto
 * @className: EurekaServiceTwoApplication.java
 * @package com.yamhto.cloud.eurekaTwo
 * @description:
 * @date 2020/3/9 14:08
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceTwoApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceTwoApplication.class, args);
    }
}
