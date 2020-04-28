package com.yamhto.cloud.mybatis.service.impl;

import com.yamhto.cloud.mybatis.entity.UserRole;
import com.yamhto.cloud.mybatis.mapper.UserRoleMapper;
import com.yamhto.cloud.mybatis.service.UserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 用户-角色对应表 服务实现类
 * </p>
 *
 * @author yamhto
 * @since 2020-03-09
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {

}
