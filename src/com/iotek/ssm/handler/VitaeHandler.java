package com.iotek.ssm.handler;
import com.iotek.ssm.entity.Branch;
import com.iotek.ssm.entity.Job;
import com.iotek.ssm.entity.Tourist;
import com.iotek.ssm.entity.Vitae;
import com.iotek.ssm.service.BranchService;
import com.iotek.ssm.service.JobService;
import com.iotek.ssm.service.TouristService;
import com.iotek.ssm.service.VitaeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12.
 */
@RequestMapping("vitae")
@Controller
public class VitaeHandler {
    @Autowired
    private VitaeService vitaeService;
    @Autowired
    private BranchService branchService;
    @Autowired
    private JobService jobService;
    @Autowired
    private TouristService touristService;

    @RequestMapping("findmyvitae")
    public String myvitae(Integer id, Model model){
        Vitae vitae = vitaeService.findVitaeByTouristId(id);
            model.addAttribute("vitae",vitae);
            return "vitae/myvitae";
    }

    @RequestMapping("addvitae")
    public String addVitae( Model model,Integer tid){
        Vitae vitae = vitaeService.findVitaeByTouristId(tid);
        List<Branch> branches = branchService.findAllBranch();
        model.addAttribute("tid",tid);
        model.addAttribute("viate",vitae);
        model.addAttribute("branches",branches);
        return "vitae/addmyvitae";
    }

    @RequestMapping("insertmyvitae")
    public String addMyVitae(Vitae vitae,Integer branches,Integer jobs,Integer tid){
        Branch branch1 = branchService.findBranchById(branches);
        Job job1 = jobService.findJobById(jobs);
        Tourist tourist = touristService.findTouristById(tid);
        vitae.setBranch(branch1);
        vitae.setJob(job1);
        vitae.setTourist(tourist);
        vitae.setState("未投递");
        vitaeService.addVitae(vitae);
        return "vitae/addmyvitae";
    }

    @RequestMapping("editvitae")
    public String editVitae( Model model,Integer tid){
        Vitae vitae = vitaeService.findVitaeByTouristId(tid);
        List<Branch> branches = branchService.findAllBranch();
        model.addAttribute("vitae",vitae);
        model.addAttribute("branches",branches);
        model.addAttribute("tid",tid);
        return "vitae/editmyvitae";
    }


    @RequestMapping("updatemyvitae")
    public String updateMyVitae(Vitae vitae,Integer branches,Integer jobs,Integer tid){
        Branch branch1 = branchService.findBranchById(branches);
        Job job1 = jobService.findJobById(jobs);
        Tourist tourist = touristService.findTouristById(tid);
        vitae.setBranch(branch1);
        vitae.setJob(job1);
        vitae.setTourist(tourist);
        vitaeService.updateVitae(vitae);
        return "forward:editvitae";
    }

    @RequestMapping("resume")
    public String resume(Integer tid){
        Vitae vitae = vitaeService.findVitaeByTouristId(tid);
        vitae.setState("已投递");
        vitaeService.updateVitae(vitae);
        return "redirect:/recruit/findallrecruit";
    }

    @RequestMapping("findvitaebystate")
    public String findVitaeByState(Model model){
        List<Vitae> vitaes = vitaeService.findVitaeByState();
        model.addAttribute("vitaes",vitaes);
        return "vitae/showallvitae";
    }

    @RequestMapping("readvitae")
    @ResponseBody
    public void readVitae(Integer tid){
        System.out.println(tid+"kkkkkkkkkk");
        Vitae vitae = vitaeService.findVitaeByTouristId(tid);
        vitae.setRead("已阅");
        System.out.println(vitae);
        vitaeService.updateVitae(vitae);
        System.out.println("jjjjjjjjjjjjj");
    }
}
