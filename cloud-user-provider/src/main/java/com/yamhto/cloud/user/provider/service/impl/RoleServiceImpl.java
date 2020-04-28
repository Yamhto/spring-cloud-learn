package com.yamhto.cloud.user.provider.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.yamhto.cloud.user.provider.entity.Role;
import com.yamhto.cloud.user.provider.mapper.RoleMapper;
import com.yamhto.cloud.user.provider.service.RoleService;
import org.springframework.stereotype.Service;

/**
 * <p>
 * 角色 服务实现类
 * </p>
 *
 * @author yamhto
 * @since 2020-03-09
 */
@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {

}
