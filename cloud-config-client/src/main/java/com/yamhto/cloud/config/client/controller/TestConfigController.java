package com.yamhto.cloud.config.client.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yamhto
 * @className: TestConfigController.java
 * @package com.yamhto.cloud.config.client.controller
 * @description:
 * @date 2020/3/16 11:36
 */
@RestController
@RequestMapping("/config")
public class TestConfigController {

    @Value("${name}")
    private String name ;

    @RequestMapping("/name")
    public String testConfig(){
        return name;
    }
}
