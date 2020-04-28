package com.yamhto.cloud.user.provider.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.yamhto.cloud.user.provider.entity.User;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author yamhto
 * @since 2020-03-09
 */
public interface UserService extends IService<User> {

    public User login(String id);

}
