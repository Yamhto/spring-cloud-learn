package com.yamhto.cloud.user.consumer;

import com.yamhto.cloud.rest.template.annnotation.EnableRestTemplate;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yamhto
 * @className: UserConsumerApplication.java
 * @package com.yamhto.cloud.user.consumer
 * @description:
 * @date 2020/3/10 10:08
 */
@SpringBootApplication
@EnableEurekaClient
@EnableRestTemplate
public class UserConsumerApplication {

    public static void main(String[] args) {
        SpringApplication.run(UserConsumerApplication.class, args);
    }
}
