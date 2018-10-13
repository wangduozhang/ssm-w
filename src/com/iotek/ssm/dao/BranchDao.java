package com.iotek.ssm.dao;

import com.iotek.ssm.entity.Branch;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by Administrator on 2018/10/13.
 */
@Repository
public interface BranchDao {
    public List<Branch> queryAllBranch();
}
