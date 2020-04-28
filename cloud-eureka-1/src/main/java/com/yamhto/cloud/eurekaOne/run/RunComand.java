package com.yamhto.cloud.eurekaOne.run;

import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

/**
 * @author yamhto
 * @className: runComand.java
 * @package com.yamhto.cloud.eurekaOne.run
 * @description:
 * @date 2020/3/19 14:11
 */
@Component
public class RunComand implements CommandLineRunner {

    @Override
    public void run(String... args) throws Exception {
        System.out.println("启动后执行");
    }
}
