package org.lijian.gmall.user.controller;

import org.lijian.gmall.user.model.User;
import org.lijian.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * @Author ： lijian
 * @Date ： 2020/3/9 11:55
 * @Description： 用户服务接口
 * @Modified By：
 */
@RestController
@RequestMapping("/api/v1/users")
public class UserController {

    @Autowired
    UserService userService;

    @GetMapping
    public List<User> getAllUsers(){
        return userService.getAllUsers();
    }

}
