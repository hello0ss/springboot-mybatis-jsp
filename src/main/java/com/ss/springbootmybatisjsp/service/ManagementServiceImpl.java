package com.ss.springbootmybatisjsp.service;

import com.ss.springbootmybatisjsp.dao.ManagementDAO;
import com.ss.springbootmybatisjsp.entity.Management;
import com.ss.springbootmybatisjsp.util.Md5Utils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;


@Transactional
@Service
public class ManagementServiceImpl implements ManagementService {

    @Autowired
    ManagementDAO managementDAO;

    @Override
    public String loginManagement(String username, String password) {
        Management management = managementDAO.loginManagement(username);

        String message = null;

        if (management != null) {
            if (management.getPassword().equals(Md5Utils.getMd5Code(password + management.getSalt()))) {

                return message = "登录成功";
            } else {

                return message = "密码输入错误";
            }
        } else {
            return message = "该用户不存在";
        }
    }

    @Override
    public void registerManagement(Management management) {
        managementDAO.registerManagement(management);
    }
}
