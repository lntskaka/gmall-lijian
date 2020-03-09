package org.lijian.gmall.user.controller;

import org.lijian.gmall.user.model.RespBean;
import org.lijian.gmall.user.model.User;
import org.lijian.gmall.user.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

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
    public RespBean getAllUsers() {
        return RespBean.ok("获取成功", userService.getAllUsers());
    }

    @GetMapping("/{id}")
    public RespBean getUserById(@PathVariable("id") Long id) {
        return RespBean.ok("获取成功", userService.getUserById(id));
    }

    @PostMapping
    public RespBean addUser(@RequestBody User user) {
        if (userService.addUser(user) == 1) {
            return RespBean.ok("添加成功", user);
        }
        return RespBean.error("添加失败");
    }

    @PutMapping
    public RespBean updateUser(@RequestBody User user) {
        if (userService.updateUser(user) == 1) {
            return RespBean.ok("更新成功", user);
        }
        return RespBean.error("更新失败");
    }

    @DeleteMapping("/{id}")
    public RespBean deleteUser(@PathVariable("id") Long id) {
        if (userService.deleteUser(id) == 1) {
            return RespBean.ok("删除成功");
        }
        return RespBean.error("删除失败");
    }
}
