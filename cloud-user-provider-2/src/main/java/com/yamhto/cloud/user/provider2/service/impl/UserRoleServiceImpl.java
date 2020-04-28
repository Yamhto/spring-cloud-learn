package com.yamhto.cloud.user.provider2.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yamhto.cloud.user.provider2.entity.UserRole;
import com.yamhto.cloud.user.provider2.mapper.UserRoleMapper;
import com.yamhto.cloud.user.provider2.service.UserRoleService;
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
