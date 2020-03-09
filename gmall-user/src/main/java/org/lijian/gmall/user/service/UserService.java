package org.lijian.gmall.user.service;

import org.lijian.gmall.user.model.User;

import java.util.List;

/**
 * @Author ： lijian
 * @Date ： 2020/3/9 11:56
 * @Description： 用户服务接口
 * @Modified By：
 */
public interface UserService {
    List<User> getAllUsers();

    int addUser(User user);

    int updateUser(User user);

    int deleteUser(Long id);

    User getUserById(Long id);
}
