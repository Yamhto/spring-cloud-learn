package com.yamhto.cloud.user.consumer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

/**
 * @author yamhto
 * @className: UserController.java
 * @package com.yamhto.cloud.user.consumer.controller
 * @description:
 * @date 2020/3/10 10:17
 */
@RequestMapping(value = "/user")
@RestController
public class UserController {

    private static final String URL = "http://CLOUD-USER-PROVIDER";

    @Autowired
    private RestTemplate restTemplate;

    @GetMapping("/consumer/get/{id}")
    public String login(@PathVariable(value = "id") String id) {
        return restTemplate.getForObject(URL + "/user/get/" + id, String.class);
    }

}
