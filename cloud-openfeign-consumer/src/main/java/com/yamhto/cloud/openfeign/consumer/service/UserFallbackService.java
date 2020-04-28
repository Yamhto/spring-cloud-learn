package com.yamhto.cloud.openfeign.consumer.service;

import org.springframework.stereotype.Component;

/**
 * @author yamhto
 * @className: UserFallbackService.java
 * @package com.yamhto.cloud.openfeign.consumer.service
 * @description:
 * @date 2020/3/10 17:30
 */
@Component
public class UserFallbackService implements UserService {
    @Override
    public String login(String id) {
        return "服务器繁忙,请稍后访问！";
    }
}
