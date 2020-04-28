package com.yamhto.cloud.mybatis.service.impl;

import com.yamhto.cloud.mybatis.entity.Role;
import com.yamhto.cloud.mybatis.mapper.RoleMapper;
import com.yamhto.cloud.mybatis.service.RoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
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
