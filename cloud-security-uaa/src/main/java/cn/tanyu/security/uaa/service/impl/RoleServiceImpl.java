package cn.tanyu.security.uaa.service.impl;


import cn.tanyu.security.uaa.entity.Role;
import cn.tanyu.security.uaa.mapper.RoleMapper;
import cn.tanyu.security.uaa.service.IRoleService;
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
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements IRoleService {

}
