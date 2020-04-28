package com.yamhto.cloud.user.provider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yamhto
 * @className: UserProviderApplication.java
 * @package com.yamhto.cloud.user.provider
 * @description:
 * @date 2020/3/9 17:35
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.yamhto.cloud.user.provider.mapper"})
public class UserProviderApplication {

    public static void main(String[] args) {

        SpringApplication.run(UserProviderApplication.class, args);

    }
}
