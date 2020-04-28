package com.yamhto.cloud.user.provider2.controller;


import com.google.gson.Gson;
import com.yamhto.cloud.user.provider2.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * <p>
 * 前端控制器
 * </p>
 *
 * @author yamhto
 * @since 2020-03-09
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Autowired
    private UserService userService;


    @RequestMapping("/get/{id}")
    public String getUserInfo(@PathVariable("id") String id) {
        return new Gson().toJson(userService.login(id));
    }

}
