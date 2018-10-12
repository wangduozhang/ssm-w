package com.iotek.ssm.handler;
import com.iotek.ssm.entity.Vitae;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by Administrator on 2018/10/12.
 */
@RequestMapping("vitae")
@Controller
public class VitaeHandler {
    @RequestMapping("myvitae")
    public String myvitae(){
        return "vitae/myvitae";
    }
    @RequestMapping("addvitae")
    public String addVitae(Vitae vitae){
        return "";
    }
}
