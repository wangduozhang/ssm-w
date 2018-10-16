package com.iotek.ssm.service.impl;

import com.iotek.ssm.dao.BranchDao;
import com.iotek.ssm.entity.Branch;
import com.iotek.ssm.service.BranchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/13.
 */
@Service("branchService")
public class BranchServiceImpl implements BranchService {
    @Autowired
    private BranchDao branchDao;
    @Override
    public List<Branch> findAllBranch() {
        return branchDao.queryAllBranch();
    }

    @Override
    public Branch findBranchByName(String branch) {
        return branchDao.queryBranchByName(branch);
    }

    @Override
    public Branch findBranchById(Integer branch) {
        return branchDao.queryBranchById(branch);
    }
}
