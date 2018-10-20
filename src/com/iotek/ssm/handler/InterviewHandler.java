package com.iotek.ssm.handler;
import com.iotek.ssm.entity.Employee;
import com.iotek.ssm.entity.Interview;
import com.iotek.ssm.service.EmployeeService;
import com.iotek.ssm.service.InterviewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by Administrator on 2018/10/12.
 */
@RequestMapping("interview")
@Controller
public class InterviewHandler {
    @Autowired
    private InterviewService interviewService;
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("addinterview")
    public String addInterview(Model model,Integer tid){
        List<Employee> employees = employeeService.findAllEmployee();
        model.addAttribute("employees",employees);
        model.addAttribute("tid",tid);
        return "interview/addinterview";
    }

    @RequestMapping("insertinterview")
    public String insertInterview(Interview interview, Integer tid,Integer eid){
        interviewService.insertInterview(interview,tid,eid);
        return "redirect:/vitae/findvitaebystate";
    }

    @RequestMapping("findinterviewbytid")
    public String findInterviewByTid(Integer tid,Model model){
        List<Interview> interviews = interviewService.findInterviewByTid(tid);
        model.addAttribute("interviews",interviews);
        return "interview/showinterview";
    }

    @RequestMapping("gointerview")
    public String goInterview(Integer id){
        interviewService.editInterview(id);
        return "forward:gointerview";
    }
}
