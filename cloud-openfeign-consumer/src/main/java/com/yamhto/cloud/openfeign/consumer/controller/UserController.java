package com.yamhto.cloud.openfeign.consumer.controller;

import com.yamhto.cloud.openfeign.consumer.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


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

    @Autowired
    @Qualifier("userService")
    private UserService userService;

    @GetMapping("/openfeign/consumer/get/{id}")
    public String login(@PathVariable(value = "id") String id) {
        return userService.login(id);
    }
}
