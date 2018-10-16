package com.iotek.ssm.service;

import com.iotek.ssm.entity.Branch;

import java.util.List;

/**
 * Created by Administrator on 2018/10/13.
 */
public interface BranchService {
    public List<Branch> findAllBranch();

    Branch findBranchByName(String branch);

    Branch findBranchById(Integer branch);
}
