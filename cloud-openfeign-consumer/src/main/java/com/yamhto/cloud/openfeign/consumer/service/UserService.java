package com.yamhto.cloud.openfeign.consumer.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

/**
 * @author yamhto
 * @className: UserService.java
 * @package com.yamhto.cloud.openfeign.consumer.service
 * @description:
 * @date 2020/3/10 14:19
 */
@FeignClient(value = "CLOUD-USER-PROVIDER", fallback = UserFallbackService.class, path = "/user", qualifier = "userService")
@Component
public interface UserService {

    @GetMapping("/get/{id}")
    public String login(@PathVariable("id") String id);
}
