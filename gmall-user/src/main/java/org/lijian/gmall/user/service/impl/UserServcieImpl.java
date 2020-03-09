package org.lijian.gmall.user.service.impl;

import org.lijian.gmall.user.mapper.UserMapper;
import org.lijian.gmall.user.model.User;
import org.lijian.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author ： lijian
 * @Date ： 2020/3/9 11:56
 * @Description： 用户服务类实现
 * @Modified By：
 */
@Service
public class UserServcieImpl implements UserService {
    @Autowired
    UserMapper userMapper;

    @Override
    public List<User> getAllUsers() {
        return userMapper.selectAllUsers();
    }

    @Override
    public User getUserById(Long id) {
        return userMapper.selectByPrimaryKey(id);
    }

    @Override
    public int addUser(User user) {
        return userMapper.insertSelective(user);
    }

    @Override
    public int updateUser(User user) {
        return userMapper.updateByPrimaryKeySelective(user);
    }

    @Override
    public int deleteUser(Long id) {
        return userMapper.deleteByPrimaryKey(id);
    }
}
