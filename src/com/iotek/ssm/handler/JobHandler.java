package com.iotek.ssm.handler;
import com.iotek.ssm.entity.Branch;
import com.iotek.ssm.entity.Job;
import com.iotek.ssm.entity.Vitae;
import com.iotek.ssm.service.BranchService;
import com.iotek.ssm.service.VitaeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12.
 */
@RequestMapping("job")
@Controller
public class JobHandler {
    @Autowired
    private JobService jobService;
    @RequestMapping("finjobbybranch")
    @ResponseBody
    public String deleteStudentById(Integer id){
        List<Job> jobs = jobService.findJobByBId(id);


    }

}
