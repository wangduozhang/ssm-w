package com.iotek.ssm.handler;
import com.iotek.ssm.entity.Branch;
import com.iotek.ssm.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import java.util.Date;

/**
 * Created by Administrator on 2018/10/12.
 */
@RequestMapping("branch")
@Controller
public class BranchHandler {
    @Autowired
    private BranchService branchService;

    @RequestMapping("addbranch")
    public String addBranch(){
        return "branch/addbranch";
    }

    @RequestMapping("insertbranch")
    public String insertBranch(Branch branch){
        branch.setTime(new Date());
        branchService.insertBranch(branch);
        return "forward:addbranch";
    }

}
