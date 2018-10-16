package com.iotek.ssm.handler;

import com.iotek.ssm.entity.Tourist;
import com.iotek.ssm.service.TouristService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

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
    public String addtourist(Tourist tourist){
        touristService.addTourist(tourist);
        return "tourist/inputtourist";
    }
    //登录
    @RequestMapping("loginTourist")
    public String loginTourist(String name, String password, Model model){
        Tourist tourist = touristService.findTouristByNameAndPass(name,password);
            model.addAttribute("tourist",tourist);
            return "tourist/basetourist";
    }
    @RequestMapping("loginajax")
    @ResponseBody
    public String loginAjax(String name, String password){
        Tourist tourist = touristService.findTouristByNameAndPass(name,password);
       if (null==tourist){
           return "666";
       }else {
           return "";
       }
    }

    @RequestMapping("inputajax")
    @ResponseBody
    public String inputAjax(String name){
        Tourist tourist = touristService.findTouristByName(name);
        if (null!=tourist){
            return "666";
        }else {
            return "";
        }
    }
}
