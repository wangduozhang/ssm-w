package com.iotek.ssm.handler;
import com.iotek.ssm.entity.*;
import com.iotek.ssm.service.EmployeeService;
import com.iotek.ssm.service.WorkService;
import com.iotek.ssm.util.TimeUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

/**
 * Created by Administrator on 2018/10/12.
 */
@RequestMapping("work")
@Controller
public class WorkHandler {
    @Autowired
    private EmployeeService employeeService;
    @Autowired
    private WorkService workService;
    @RequestMapping("goajax")
    @ResponseBody
    public void goAjax(Integer id){
        Employee employee = employeeService.findEmployeeById(id);
        Date date = new Date();
        Work work = new Work();
        work.setTime(TimeUtil.getTime());
        work.setGoTime(date);
        work.setLateness(TimeUtil.getLatenes(date));
        work.setAbsent(TimeUtil.getAbsent(date));
        work.setEmployee(employee);
        workService.goInsertWork(work);
    }
}
