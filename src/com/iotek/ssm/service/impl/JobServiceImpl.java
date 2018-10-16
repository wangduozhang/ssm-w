package com.iotek.ssm.service.impl;

import com.iotek.ssm.dao.JobDao;
import com.iotek.ssm.entity.Job;
import com.iotek.ssm.service.JobService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * Created by Administrator on 2018/10/13.
 */
@Service("jobService")
public class JobServiceImpl implements JobService {
    @Autowired
    private JobDao jobDao;

    @Override
    public List<Job> findAllJobByBId(Integer id) {
        return jobDao.queryAllJobByBId(id);
    }

    @Override
    public Job findJobByName(String job) {
        return jobDao.queryJobByName(job);
    }

    @Override
    public Job findJobById(Integer job) {
        return jobDao.queryJobById(job);
    }
}
