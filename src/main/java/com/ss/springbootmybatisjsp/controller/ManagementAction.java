package com.ss.springbootmybatisjsp.controller;


import com.ss.springbootmybatisjsp.entity.Management;
import com.ss.springbootmybatisjsp.service.ManagementService;
import com.ss.springbootmybatisjsp.util.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpServletRequest;

@Controller
@RequestMapping("management")
public class ManagementAction {

    @Autowired
    ManagementService managementService;

    @RequestMapping("loginMethod")
    public String loginMethod(String username, String password, HttpServletRequest request) {
        System.out.println("------------------管理员登录--------------------");

        System.out.println(username + "----" + password);
        String message = managementService.loginManagement(username, password);

        if (message == "该用户不存在") {
            System.out.println("1");
            request.setAttribute("message", message);
            return "login";
        } else {
            if (message == "密码输入错误") {
                System.out.println("2");
                request.setAttribute("message", message);
                return "login";
            } else if (message == "登录成功") {
                System.out.println("3");
                request.setAttribute("message", message);
                return "redirect:/section/ShowAllSectionMethod";
            }
        }
        return "login";
    }

    @RequestMapping("registerMethod")
    public String registerMethod(String username, String realname, String password, String sex) {
        System.out.println("------------------管理员注册-----------------");

        String s = Md5Utils.getSalt(8);
        String s1 = Md5Utils.getNumber(6);
        String s2 = Md5Utils.getMd5Code(password + s);

        managementService.registerManagement(new Management(s1, username, realname, s2, sex, s));

        return "redirect:/login.jsp";
    }


}