package com.yamhto.cloud.mybatis.service.impl;

import com.yamhto.cloud.mybatis.entity.User;
import com.yamhto.cloud.mybatis.mapper.UserMapper;
import com.yamhto.cloud.mybatis.service.UserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author yamhto
 * @since 2020-03-09
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

}
