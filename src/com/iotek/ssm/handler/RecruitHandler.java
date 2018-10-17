package com.iotek.ssm.handler;
import com.alibaba.fastjson.JSON;
import com.iotek.ssm.entity.Branch;
import com.iotek.ssm.entity.Job;
import com.iotek.ssm.entity.Recruit;
import com.iotek.ssm.service.BranchService;
import com.iotek.ssm.service.JobService;
import com.iotek.ssm.service.RecruitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintWriter;
import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/10/12.
 */
@RequestMapping("recruit")
@Controller
public class RecruitHandler {
    @Autowired
    private RecruitService recruitService;

    @RequestMapping("addrecruit")
    public String addJob(Model model){
        return "recruit/addrecruit";
    }

    @RequestMapping("insertrecruit")
    public String insertRecruit(Recruit recruit){
        recruitService.insertRecruit(recruit);
        return "forward:addrecruit";
    }

    @RequestMapping("findallrecruit")
    public String findAllRecruit(Model model,Integer tid){
        List<Recruit> recruits = recruitService.findAllRecruit();
        model.addAttribute("recruits",recruits);
        model.addAttribute("tid",tid);
        return "recruit/showrecruit";
    }

}
