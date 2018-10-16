package com.iotek.ssm.service.impl;

import com.iotek.ssm.dao.AdminDao;
import com.iotek.ssm.entity.Admin;
import com.iotek.ssm.service.AdminService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Administrator on 2018/10/16.
 */
@Service("adminService")
public class AdminServiceImpl implements AdminService {
    @Autowired
    private AdminDao adminDao;
    @Override
    public Admin findAdminByNameAndPass(String name, String password) {
        return adminDao.queryAdminByNameAndPass(name,password);
    }

    @Override
    public Admin findAdminByName(String name) {
        return adminDao.queryAdminByName(name);
    }

    @Override
    public void addAdmin(Admin admin) {
        adminDao.insertAdmin(admin);
    }
}
