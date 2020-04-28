package com.yamhto.cloud.eurekaThree;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yamhto
 * @className: EurekaServiceThreeApplication.java
 * @package com.yamhto.cloud.eurekaThree
 * @description:
 * @date 2020/3/9 14:58
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceThreeApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceThreeApplication.class, args);
    }
}
