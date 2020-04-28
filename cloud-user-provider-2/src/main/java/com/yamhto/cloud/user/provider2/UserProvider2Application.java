package com.yamhto.cloud.user.provider2;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @author yamhto
 * @className: UserProvider2Application.java
 * @package com.yamhto.cloud.user.provider2
 * @description:
 * @date 2020/3/10 11:45
 */
@SpringBootApplication
@EnableEurekaClient
@MapperScan(basePackages = {"com.yamhto.cloud.user.provider2.mapper"})
public class UserProvider2Application {

    public static void main(String[] args) {


        SpringApplication.run(UserProvider2Application.class, args);

    }
}
