package com.iotek.ssm.handler;

import com.iotek.ssm.entity.Tourist;
import com.iotek.ssm.service.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/10/12.
 */
@RequestMapping("tourist")
@Controller
public class TouristHandler {
    @Autowired
    //跳转注册
    private TouristService touristService;
    @RequestMapping("registTourist")
    public String registTourist(){
        return "tourist/inputtourist";
    }
    //添加
    @RequestMapping("addtourist")
    public void addtourist(Tourist tourist){
        touristService.addTourist(tourist);
    }
    //登录
    @RequestMapping("loginTourist")
    public String loginTourist(String name, String password, Model model){
        Tourist tourist = touristService.findTouristByNameAndPass(name,password);
            model.addAttribute("tourist",tourist);
            return "tourist/showtourist";
    }

}
