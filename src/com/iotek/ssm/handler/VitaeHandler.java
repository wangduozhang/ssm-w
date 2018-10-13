package com.iotek.ssm.handler;
import com.iotek.ssm.entity.Branch;
import com.iotek.ssm.entity.Vitae;
import com.iotek.ssm.service.BranchService;
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
    @RequestMapping("myvitae")
    public String myvitae(Integer id, Model model){
        List<Branch> branches = branchService.findAllBranch();
        Vitae vitae = vitaeService.findVitaeByTouristId(id);
        model.addAttribute("branches",branches);
        model.addAttribute("vitae",vitae);
        return "vitae/myvitae";
    }
    @RequestMapping("addvitae")
    public String addVitae(Vitae vitae){
        return "";
    }
}
