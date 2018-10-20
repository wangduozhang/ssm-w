package com.iotek.ssm.handler;
import com.iotek.ssm.entity.*;
import com.iotek.ssm.service.EmployeeService;
import com.iotek.ssm.service.InterviewService;
import com.iotek.ssm.service.TouristService;
import com.iotek.ssm.service.VitaeService;
import com.iotek.ssm.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;
import java.util.List;

/**
 * Created by Administrator on 2018/10/12.
 */
@RequestMapping("employee")
@Controller
public class EmployeeHandler {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private VitaeService vitaeService;
    @Autowired
    private InterviewService interviewService;
    @Autowired
    private TouristService touristService;
@RequestMapping("addemployee")
    public String addEmployee(Model model){
    List<Interview> interviews = interviewService.findInterviewByState();
    model.addAttribute("interviews",interviews);
    return "employee/addemployee";
}


    @RequestMapping("insertemployee")
    public String insertEmployee(Integer tid){
        Vitae vitae = vitaeService.findVitaeByTouristId(tid);
        Tourist tourist = touristService.findTouristById(tid);
        Employee employee = new Employee();
        employee.setName(vitae.getName());
        employee.setPassword(tourist.getPassword());
        employee.setBranch(vitae.getBranch());
        employee.setJob(vitae.getJob());
        employeeService.addEmployee(employee);
        interviewService.editInductionByTid(tourist.getId());
        return "forward:addemployee";
    }

    @RequestMapping("loginajax")
    @ResponseBody
    public String loginAjax(String name, String password){
        Employee employee = employeeService.findEmployeeByNameAndPass(name,password);
        if (null==employee){
            return "666";
        }else {
            return "";
        }
    }

    @RequestMapping("loginemployee")
    public String loginAdmin(String name, String password,Model model){
        Employee employee = employeeService.findEmployeeByNameAndPass(name,password);
        model.addAttribute("employee",employee);
        return "employee/baseemployee";
    }

}
