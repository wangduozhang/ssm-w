package com.iotek.ssm.handler;

import com.iotek.ssm.entity.Admin;
import com.iotek.ssm.entity.Tourist;
import com.iotek.ssm.service.AdminService;
import com.iotek.ssm.service.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by Administrator on 2018/10/12.
 */
@RequestMapping("admin")
@Controller
public class AdminHandler {
    @Autowired
    //跳转注册
    private AdminService adminService;
    @RequestMapping("registAdmin")
    public String registTourist(){
        return "admin/inputadmin";
    }
    //添加
    @RequestMapping("addadmin")
    public String addAdmin(Admin admin){
        adminService.addAdmin(admin);
        return "admin/inputadmin";
    }
    //登录
    @RequestMapping("loginAdmin")
    public String loginAdmin(String name, String password, Model model){
        Admin admin = adminService.findAdminByNameAndPass(name,password);
            model.addAttribute("admin",admin);
            return "admin/baseadmin";
    }
    @RequestMapping("loginajax")
    @ResponseBody
    public String loginAjax(String name, String password){
        Admin admin = adminService.findAdminByNameAndPass(name,password);
       if (null==admin){
           return "666";
       }else {
           return "";
       }
    }

    @RequestMapping("inputajax")
    @ResponseBody
    public String inputAjax(String name){
        System.out.println(name);
        Admin admin = adminService.findAdminByName(name);
        System.out.println(55555);
        System.out.println(admin);
        if (null!=admin){
            return "666";
        }else {
            return "";
        }
    }
}
