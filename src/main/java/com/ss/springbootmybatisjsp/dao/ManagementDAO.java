package com.ss.springbootmybatisjsp.dao;

import com.ss.springbootmybatisjsp.entity.Management;

public interface ManagementDAO {

    Management loginManagement(String username);//登录

    void registerManagement(Management management);//注册
}
