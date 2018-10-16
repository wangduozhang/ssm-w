package com.iotek.ssm.service;

import com.iotek.ssm.entity.Admin;

/**
 * Created by Administrator on 2018/10/16.
 */
public interface AdminService {
    Admin findAdminByNameAndPass(String name, String password);

    Admin findAdminByName(String name);

    void addAdmin(Admin admin);
}
