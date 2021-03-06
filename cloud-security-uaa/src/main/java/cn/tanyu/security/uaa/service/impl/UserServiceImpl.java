package cn.tanyu.security.uaa.service.impl;

import cn.tanyu.security.uaa.entity.User;
import cn.tanyu.security.uaa.mapper.UserMapper;
import cn.tanyu.security.uaa.service.IUserService;
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
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
