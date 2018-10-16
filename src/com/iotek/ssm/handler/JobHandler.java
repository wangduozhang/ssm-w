package com.iotek.ssm.handler;
import com.alibaba.fastjson.JSON;
import com.iotek.ssm.entity.Job;
import com.iotek.ssm.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.io.PrintWriter;
import java.util.List;

/**
 * Created by Administrator on 2018/10/12.
 */
@RequestMapping("job")
@Controller
public class JobHandler {
    @Autowired
    private JobService jobService;
    @RequestMapping(value="finjobbybranch",produces={"text/html;charset=UTF-8"})
    @ResponseBody
    public void finJobByBranch(Integer id, PrintWriter printWriter){
        List<Job> jobs = jobService.findAllJobByBId(id);
        Object o = JSON.toJSONString(jobs);
        printWriter.print(o);
    }

}
