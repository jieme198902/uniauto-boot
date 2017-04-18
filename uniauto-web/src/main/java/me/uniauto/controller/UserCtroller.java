package me.uniauto.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import me.uniauto.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;

/**
 * Created by wangkuan on 2017/4/14.
 */
@RestController
@RequestMapping("user")
public class UserCtroller {

    @Reference
    private UserService userService;

    @ResponseBody
    @RequestMapping("login")
    public Object login(HttpServletRequest request, String name, String password) {
        try {
            return userService.login(name, password);
        } catch (Exception e) {
            e.printStackTrace();
            return "登录失败";
        }

    }
}
