package com.yamhto.cloud.eurekaOne;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @author yamhto
 * @className: EurekaServiceOneApplication.java
 * @package com.yamhto.cloud.eureka
 * @description:
 * @date 2020/3/9 13:53
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaServiceOneApplication {

    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceOneApplication.class, args);
    }
}
