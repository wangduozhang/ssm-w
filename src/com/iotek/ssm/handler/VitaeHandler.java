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
    public String addVitae( Model model){
        List<Branch> branches = branchService.findAllBranch();
        model.addAttribute("branches",branches);
        return "vitae/addmyvitae";
    }

    @RequestMapping("insertmyvitae")
    public void addMyVitae(Vitae vitae,Integer branches,Integer jobs,Integer tid){
        Branch branch1 = branchService.findBranchById(branches);
        Job job1 = jobService.findJobById(jobs);
        Tourist tourist = touristService.findTouristById(tid);
        vitae.setBranch(branch1);
        vitae.setJob(job1);
        vitae.setTourist(tourist);
        System.out.println(vitae);
        vitaeService.addVitae(vitae);
    }
}
