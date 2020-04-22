package com.ss.springbootmybatisjsp.service;

import com.ss.springbootmybatisjsp.entity.Management;

public interface ManagementService {

    String loginManagement(String username, String password);//登录

    void registerManagement(Management management);//注册
}