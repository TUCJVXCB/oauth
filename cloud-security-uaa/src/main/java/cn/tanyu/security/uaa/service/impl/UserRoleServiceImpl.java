package cn.tanyu.security.uaa.service.impl;

import cn.tanyu.security.uaa.entity.UserRole;
import cn.tanyu.security.uaa.mapper.UserRoleMapper;
import cn.tanyu.security.uaa.service.IUserRoleService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author tanyu
 * @since 2020-11-02
 */
@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements IUserRoleService {

}
