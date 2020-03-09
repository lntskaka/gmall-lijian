package org.lijian.gmall.order.controller;

import org.apache.dubbo.config.annotation.Reference;
import org.lijian.gmall.model.RespBean;
import org.lijian.gmall.service.UserService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author ： lijian
 * @Date ： 2020/3/9 23:20
 * @Description： 订单相关接口
 * @Modified By：
 */
@RestController
@RequestMapping("/api/v1/orders")
public class OrderController {
    /**
     * Dubbo测试
     */
    @Reference
    UserService userService;

    @GetMapping("/trade")
    public RespBean trade() {
        return RespBean.ok("订单方法中查询用户信息成功！", userService.getAllUsers());
    }
}
