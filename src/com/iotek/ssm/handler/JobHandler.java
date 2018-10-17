package com.iotek.ssm.handler;
import com.alibaba.fastjson.JSON;
import com.iotek.ssm.entity.Branch;
import com.iotek.ssm.entity.Job;
import com.iotek.ssm.service.BranchService;
import com.iotek.ssm.service.JobService;
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
@RequestMapping("job")
@Controller
public class JobHandler {
    @Autowired
    private JobService jobService;
    @Autowired
    private BranchService branchService;

    @RequestMapping(value="finjobbybranch",produces={"text/html;charset=UTF-8"})
    @ResponseBody
    public void finJobByBranch(Integer id, PrintWriter printWriter){
        List<Job> jobs = jobService.findAllJobByBId(id);
        Object o = JSON.toJSONString(jobs);
        printWriter.print(o);
    }

    @RequestMapping("addjob")
    public String addJob(Model model){
        List<Branch> branches = branchService.findAllBranch();
        model.addAttribute("branches",branches);
        return "job/addjob";
    }

    @RequestMapping("insertjob")
    public String insertJob(Job job,Integer branches){
        System.out.println(branches);
        Branch branch1 = branchService.findBranchById(branches);
        job.setTime(new Date());
        job.setBranch(branch1);
        jobService.insertJob(job);
        return "forward:addjob";
    }


}
